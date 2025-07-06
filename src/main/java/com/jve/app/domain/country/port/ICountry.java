package com.jve.app.domain.country.port;

import com.jve.app.domain.country.entity.CountryTable;
import com.jve.app.domain.country.entity.CountryWithState;
import com.jve.app.infrastructure.controller.model.PageResult;
import com.jve.app.infrastructure.controller.model.command.CountriesSearchRequest;

public interface ICountry {
    CountryWithState findByIso3(String iso3);

    PageResult<CountryTable> search(CountriesSearchRequest request);
}
