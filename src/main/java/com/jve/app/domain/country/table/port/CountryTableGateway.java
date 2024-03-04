package com.jve.app.domain.country.table.port;

import com.jve.app.domain.country.table.entity.CountryTableEntity;

import java.util.List;

public interface CountryTableGateway {
    List<CountryTableEntity> findAll();
}
