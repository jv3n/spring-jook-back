package com.jve.app.domain.country.usecases;

import com.jve.app.domain.country.port.ICountry;
import com.jve.app.domain.country.entity.CountryWithState;
import com.jve.app.infrastructure.controller.model.dto.CountryTableRepresentation;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CountriesUsescasesImpl implements CountriesUsescases {

    private final ICountry gateway;

    public CountriesUsescasesImpl(ICountry gateway) {
        this.gateway = gateway;
    }

    @Override
    public CountryWithState findByIso3(String iso3) {
        return this.gateway.findByIso3(iso3);
    }

    @Override
    public List<CountryTableRepresentation> findAll() {
        return this.gateway.findAll()
            .stream().map(e -> new CountryTableRepresentation()
                .setId(e.getId())
                .setName(e.getName())
                .setIso3(e.getIso3())
                .setNumericCode(e.getNumericCode())
                .setCapitalName(e.getCapitalName())
                .setCurrency(e.getCurrency(), e.getCurrencyName(), e.getCurrencySymbol())
                .setRegion(e.getRegion())
                .setSubregion(e.getSubregion())
                .setLatitudeLongitude(e.getLatitude(), e.getLongitude())
                .setEmoji(e.getEmoji())
            )
            .toList();
    }
}
