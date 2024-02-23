package com.jve.app.infrastructure.gateway.country;

import com.jve.app.core.entities.CountryEntity;

import java.util.List;

public interface CountryGateway {
    List<CountryEntity> findAll();
    CountryEntity findByName(String countryName);
}
