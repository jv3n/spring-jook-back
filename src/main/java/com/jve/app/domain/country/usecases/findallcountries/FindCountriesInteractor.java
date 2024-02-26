package com.jve.app.domain.country.usecases.findallcountries;

import com.jve.app.domain.country.entity.CountryEntity;
import com.jve.app.domain.country.port.CountryGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindCountriesInteractor implements FindCountriesBoundary {

    private final CountryGateway gateway;

    public FindCountriesInteractor(CountryGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<CountryEntity> findAll() {
        return this.gateway.findAll();
    }

    @Override
    public CountryEntity findByName(String countryName) {
        return this.gateway.findByName(countryName);
    }
}
