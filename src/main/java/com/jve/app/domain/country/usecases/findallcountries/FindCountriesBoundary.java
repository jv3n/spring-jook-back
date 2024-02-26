package com.jve.app.domain.country.usecases.findallcountries;

import com.jve.app.domain.country.entity.CountryEntity;

import java.util.List;

public interface FindCountriesBoundary {
    List<CountryEntity> findAll();

    CountryEntity findByName(String countryName);
}
