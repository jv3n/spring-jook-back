package com.jve.app.domain.country.usecases;

import com.jve.app.domain.country.entity.CountryWithState;
import com.jve.app.infrastructure.controller.model.dto.CountryTableRepresentation;
import java.util.List;

public interface CountriesUsescases {
    CountryWithState findByIso3(String iso3);

    List<CountryTableRepresentation> findAll();
}
