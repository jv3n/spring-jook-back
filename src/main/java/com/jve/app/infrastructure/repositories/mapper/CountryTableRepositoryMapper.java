package com.jve.app.infrastructure.repositories.mapper;

import com.jve.app.domain.country.table.entity.CountryTableEntity;
import com.jve.app.tables.records.TCountryRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CountryTableRepositoryMapper {

    @Mapping(target = "id", source = "couId")
    @Mapping(target = "name", source = "couName")
    @Mapping(target = "iso3", source = "couIso3")
    @Mapping(target = "numericCode", source = "couNumericCode")
    @Mapping(target = "capitalName", source = "couCapital")
    @Mapping(target = "currency", source = "couCurrency")
    @Mapping(target = "currencyName", source = "couCurrencyName")
    @Mapping(target = "currencySymbol", source = "couCurrencySymbol")
    @Mapping(target = "region", source = "couRegion")
    @Mapping(target = "subregion", source = "couSubregion")
    @Mapping(target = "latitude", source = "couLatitude")
    @Mapping(target = "longitude", source = "couLongitude")
    @Mapping(target = "emoji", source = "couEmoji")
    CountryTableEntity toDTO(TCountryRecord rec);
}