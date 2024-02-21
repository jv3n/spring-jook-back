package com.jve.app.core.usecases.findallcountries;

import com.jve.app.core.usecases.findallcountries.model.dto.CountryDTO;
import com.jve.app.infrastructure.gateway.country.CountryGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindCountriesInteractor implements FindCountriesBoundary {

    private final CountryGateway gateway;

    public FindCountriesInteractor(CountryGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<CountryDTO> findAll() {
        return this.gateway.findAll()
                .stream().map(entity -> new CountryDTO()
                        .setId(entity.getId())
                        .setName(entity.getName())
                        .setShortIsoCode(entity.getShortIsoCode())
                        .setLongIsoCode(entity.getLongIsoCode())
                        .setCountryCode(entity.getCountryCode())
                        .setPhoneCode(entity.getPhoneCode())
                ).toList();
    }
}
