package com.jve.app.core.usecases.findallcountries;

import com.jve.app.core.usecases.findallcountries.model.dto.CountryDTO;

import java.util.List;

public interface FindCountriesBoundary {
    List<CountryDTO> findAll();
    CountryDTO findByName(String countryName);
}
