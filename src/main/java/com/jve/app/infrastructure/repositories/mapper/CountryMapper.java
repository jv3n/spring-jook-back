package com.jve.app.infrastructure.repositories.mapper;

import com.jve.app.core.entities.CountryEntity;
import com.jve.app.tables.records.CountryRecord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface CountryMapper {

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "shortIsoCode", source = "iso")
    @Mapping(target = "longIsoCode", source = "iso3")
    @Mapping(target = "countryCode", source = "numcode")
    @Mapping(target = "phoneCode", source = "phonecode")
    CountryEntity toDTO(CountryRecord record);

    List<CountryEntity> toDTOList(List<CountryRecord> records);
}