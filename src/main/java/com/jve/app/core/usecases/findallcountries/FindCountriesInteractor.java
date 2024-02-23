package com.jve.app.core.usecases.findallcountries;

import com.jve.app.core.entities.CountryEntityMapper;
import com.jve.app.core.usecases.findallcountries.model.dto.CountryDTO;
import com.jve.app.infrastructure.gateway.country.CountryGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindCountriesInteractor implements FindCountriesBoundary {

    private final CountryGateway gateway;
    private final CountryEntityMapper mapper;

    public FindCountriesInteractor(CountryGateway gateway, CountryEntityMapper mapper) {
        this.gateway = gateway;
        this.mapper = mapper;
    }

    @Override
    public List<CountryDTO> findAll() {
        return this.mapper.toDTOList(this.gateway.findAll());
    }

    @Override
    public CountryDTO findByName(String countryName) {

        return this.mapper.toDTO(this.gateway.findByName(countryName));
    }
}
