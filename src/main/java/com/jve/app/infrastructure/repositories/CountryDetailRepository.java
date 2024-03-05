package com.jve.app.infrastructure.repositories;

import com.jve.app.domain.country.detail.entity.CountryDetailEntity;
import com.jve.app.domain.country.detail.port.CountryDetailGateway;
import com.jve.app.domain.state.entity.StateEntity;
import com.jve.app.infrastructure.repositories.mapper.CountryDetailRepositoryMapper;
import com.jve.app.tables.records.TCityRecord;
import com.jve.app.tables.records.TCountryRecord;
import com.jve.app.tables.records.TStateRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.jve.app.Tables.*;


@Transactional(readOnly = true)
@Repository
public class CountryDetailRepository implements CountryDetailGateway {

    private final DSLContext dslContext;
    private final CountryDetailRepositoryMapper countryDetailRecordMapper;

    public CountryDetailRepository(DSLContext dslContext, CountryDetailRepositoryMapper countryDetailRecordMapper) {
        this.dslContext = dslContext;
        this.countryDetailRecordMapper = countryDetailRecordMapper;
    }

    public CountryDetailEntity findByIso3(String iso3) {
        // Perform the JOIN operation
        Result<Record> records = dslContext.select(
                        T_COUNTRY.asterisk(),
                        T_STATE.asterisk(),
                        T_CITY.asterisk())
                .from(T_COUNTRY)
                .join(T_STATE).on(T_COUNTRY.COU_ID.eq(T_STATE.STA_COUNTRY_ID))
                .join(T_CITY).on(T_STATE.STA_ID.eq(T_CITY.CTY_STATE_ID))
                .where(T_COUNTRY.COU_ISO3.eq(iso3.toUpperCase()))
                .fetch();

        // Initialize maps to store the cities and states
        Map<TStateRecord, Set<TCityRecord>> stateCitiesMap = new HashMap<>();
        final TCountryRecord[] countryRecord = {null};

        records.forEach(r -> {
            if (countryRecord[0] == null) {
                countryRecord[0] = r.into(T_COUNTRY);
            }

            // Extract the state and city from the record
            TStateRecord stateRecord = r.into(T_STATE);
            TCityRecord cityRecord = r.into(T_CITY);

            // Get the current set of cities for the state, or create a new set if none exists
            Set<TCityRecord> currStateCities = stateCitiesMap.getOrDefault(stateRecord, new HashSet<>());

            // Add the city to the set
            currStateCities.add(cityRecord);

            // Store the updated set in the map
            stateCitiesMap.put(stateRecord, currStateCities);
        });

        // Map records to entities
        CountryDetailEntity country = countryDetailRecordMapper.toCountryDetailEntity(countryRecord[0]);

        stateCitiesMap.forEach((key, value) -> {
            StateEntity stateEntity = countryDetailRecordMapper.toStateEntity(key);

            // Convert the cities and set it to state entity
            stateEntity.setCities(value.stream()
                    .map(countryDetailRecordMapper::toCityEntity)
                    .collect(Collectors.toSet()));

            // Add the state entity to the country
            country.getStates().add(stateEntity);
        });

        return country;
    }
}
