package com.jve.app.infrastructure.repositories;

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
}