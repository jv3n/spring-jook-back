package com.jve.app.infrastructure.repositories;

import com.jve.app.domain.country.table.entity.CountryTableEntity;
import com.jve.app.domain.country.table.port.CountryTableGateway;
import com.jve.app.infrastructure.repositories.mapper.CountryTableRepositoryMapper;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.jve.app.Tables.T_COUNTRY;


@Transactional(readOnly = true)
@Repository
public class CountryTableRepository implements CountryTableGateway {
    private final DSLContext dslContext;

    private final CountryTableRepositoryMapper mapper;

    public CountryTableRepository(DSLContext dslContext, CountryTableRepositoryMapper mapper) {
        this.dslContext = dslContext;
        this.mapper = mapper;
    }

    public List<CountryTableEntity> findAll() {
        return dslContext
                .selectFrom(T_COUNTRY)
                .fetch()
                .map(mapper::toDTO);
    }
}
