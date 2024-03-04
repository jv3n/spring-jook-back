package com.jve.app.domain.country.table.usecases;

import com.jve.app.domain.country.table.domainobject.CountryTable;
import com.jve.app.domain.country.table.entity.CountryTableEntity;

import java.util.List;

public interface FindCountriesTableBoundary {
    List<CountryTable> findAll();
}
