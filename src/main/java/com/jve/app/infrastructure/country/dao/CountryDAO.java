package com.jve.app.infrastructure.country.dao;

import com.jve.app.domain.country.entity.CountryEntity;
import com.jve.app.domain.country.port.CountryGateway;
import com.jve.app.infrastructure.country.repositories.CountryRepository;
import com.jve.app.infrastructure.country.repositories.mapper.CountryRecordMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryDAO implements CountryGateway {

    private final CountryRecordMapper mapper;
    private final CountryRepository repository;

    public CountryDAO(CountryRecordMapper mapper, CountryRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Override
    public List<CountryEntity> findAll() {
        return this.mapper.toDTOList(this.repository.findAll());
    }

    @Override
    public CountryEntity findByName(String countryName) {
        return this.mapper.toDTO(this.repository.findByName(countryName));
    }
}
