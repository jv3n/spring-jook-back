package com.jve.app.infrastructure.country.repositories.mapper;

import com.jve.app.domain.country.entity.CountryEntity;
import com.jve.app.tables.records.TCountryRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CountryRecordMapper {

    @Mapping(target = "id", source = "couId")
    @Mapping(target = "name", source = "couName")
    @Mapping(target = "nativeName", source = "couNative")
    @Mapping(target = "iso3", source = "couIso3")
    @Mapping(target = "iso2", source = "couIso2")
    @Mapping(target = "numericCode", source = "couNumericCode")
    @Mapping(target = "phoneCode", source = "couPhoneCode")
    @Mapping(target = "capitalName", source = "couCapital")
    @Mapping(target = "currency", source = "couCurrency")
    @Mapping(target = "currencyName", source = "couCurrencyName")
    @Mapping(target = "currencySymbol", source = "couCurrencySymbol")
    @Mapping(target = "topLevelDomain", source = "couTld")
    @Mapping(target = "region", source = "couRegion")
    @Mapping(target = "regionId", source = "couRegionId")
    @Mapping(target = "subregion", source = "couSubregion")
    @Mapping(target = "subregionId", source = "couSubregionId")
    @Mapping(target = "nationality", source = "couNationality")
    @Mapping(target = "latitude", source = "couLatitude")
    @Mapping(target = "longitude", source = "couLongitude")
    @Mapping(target = "emoji", source = "couEmoji")
    @Mapping(target = "emojiu", source = "couEmojiu")
    CountryEntity toDTO(TCountryRecord rec);

    List<CountryEntity> toDTOList(List<TCountryRecord> recs);
}