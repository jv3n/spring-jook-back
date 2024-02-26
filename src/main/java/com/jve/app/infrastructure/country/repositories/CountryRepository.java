package com.jve.app.infrastructure.country.repositories;

import com.jve.app.tables.records.CountryRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.jve.app.Tables.COUNTRY;


@Repository
public class CountryRepository {
    private final DSLContext dslContext;

    public CountryRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<CountryRecord> findAll() {
        return dslContext.selectFrom(COUNTRY).fetch();
    }

    public CountryRecord findByName(String countryName) {
        return dslContext.selectFrom(COUNTRY)
                .where(COUNTRY.NAME.eq(countryName.toUpperCase()))
                .fetchOne();
    }
}
