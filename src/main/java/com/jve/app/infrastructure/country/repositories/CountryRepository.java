package com.jve.app.infrastructure.country.repositories;

import com.jve.app.tables.records.TCountryRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.jve.app.Tables.T_COUNTRY;


@Transactional(readOnly = true)
@Repository
public class CountryRepository {
    private final DSLContext dslContext;

    public CountryRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<TCountryRecord> findAll() {
        return dslContext.selectFrom(T_COUNTRY).fetch();
    }

    public TCountryRecord findByName(String countryName) {
        return dslContext.selectFrom(T_COUNTRY)
                .where(T_COUNTRY.COU_NAME.eq(countryName.toUpperCase()))
                .fetchOne();
    }
}
