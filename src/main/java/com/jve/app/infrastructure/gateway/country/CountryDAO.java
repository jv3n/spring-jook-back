package com.jve.app.infrastructure.gateway.country;

import com.jve.app.core.entities.CountryEntity;
import com.jve.app.infrastructure.repositories.CountryRepository;
import com.jve.app.infrastructure.repositories.mapper.CountryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryDAO implements CountryGateway {

    private final CountryMapper mapper;
    private final CountryRepository repository;

    public CountryDAO(CountryMapper mapper, CountryRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<CountryEntity> findAll() {
        return this.mapper.toDTOList(this.repository.findAll());
    }
}