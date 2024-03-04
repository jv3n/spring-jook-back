package com.jve.app.domain.country.detail.usecases;

import com.jve.app.domain.country.detail.entity.CountryDetailEntity;

public interface FindCountriesDetailBoundary {
    CountryDetailEntity findByIso3(String iso3);
}
