package com.jve.app.domain.country.detail.usecases;

import com.jve.app.domain.country.detail.port.CountryDetailGateway;
import com.jve.app.domain.country.detail.entity.CountryDetailEntity;
import org.springframework.stereotype.Service;

@Service
public class FindCountriesDetailInteractor implements FindCountriesDetailBoundary {

    private final CountryDetailGateway gateway;

    public FindCountriesDetailInteractor(CountryDetailGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public CountryDetailEntity findByIso3(String iso3) {
        return this.gateway.findByIso3(iso3);
    }
}
