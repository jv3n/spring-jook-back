package com.jve.app.domain.country.port;

import com.jve.app.domain.country.entity.CountryTable;
import com.jve.app.domain.country.entity.CountryWithState;
import java.util.List;

public interface ICountry {
    CountryWithState findByIso3(String iso3);

    List<CountryTable> findAll();
}
