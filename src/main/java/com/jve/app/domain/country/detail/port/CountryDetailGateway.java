package com.jve.app.domain.country.detail.port;

import com.jve.app.domain.country.detail.entity.CountryDetailEntity;

public interface CountryDetailGateway {
    CountryDetailEntity findByIso3(String iso3);
}
