package com.jve.app.domain.country.table.usecases;

import com.jve.app.domain.country.table.domainobject.CountryTable;
import com.jve.app.domain.country.table.entity.CountryTableEntity;
import com.jve.app.domain.country.table.port.CountryTableGateway;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindCountriesTableInteractor implements FindCountriesTableBoundary {

    private final CountryTableGateway gateway;

    public FindCountriesTableInteractor(CountryTableGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public List<CountryTable> findAll() {
        return this.gateway.findAll()
                .stream().map(e -> new CountryTable()
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
