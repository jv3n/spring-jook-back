package com.jve.app.domain.country.usecases;

import com.jve.app.domain.country.entity.CountryWithState;
import com.jve.app.infrastructure.controller.model.PageResult;
import com.jve.app.infrastructure.controller.model.command.CountriesSearchRequest;
import com.jve.app.infrastructure.controller.model.dto.CountryTableRepresentation;

public interface CountriesUsescases {

  CountryWithState findByIso3(String iso3);

  PageResult<CountryTableRepresentation> search(CountriesSearchRequest request);
}
