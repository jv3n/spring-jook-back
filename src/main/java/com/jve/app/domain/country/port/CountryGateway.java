package com.jve.app.domain.country.port;

import com.jve.app.domain.country.entity.CountryEntity;

import java.util.List;

public interface CountryGateway {
    List<CountryEntity> findAll();

    CountryEntity findByName(String countryName);
}
