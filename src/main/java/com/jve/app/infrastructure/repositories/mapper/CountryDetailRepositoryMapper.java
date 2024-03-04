package com.jve.app.infrastructure.repositories.mapper;

import com.jve.app.domain.city.entity.CityEntity;
import com.jve.app.domain.country.detail.entity.CountryDetailEntity;
import com.jve.app.domain.state.entity.StateEntity;
import com.jve.app.tables.records.TCityRecord;
import com.jve.app.tables.records.TCountryRecord;
import com.jve.app.tables.records.TStateRecord;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.Set;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface CountryDetailRepositoryMapper {

    @Mapping(target = "id", source = "ctyId")
    @Mapping(target = "name", source = "ctyName")
    @Mapping(target = "latitude", source = "ctyLatitude")
    @Mapping(target = "longitude", source = "ctyLongitude")
    CityEntity toCityEntity(TCityRecord cityRecord);

    @Mapping(target = "id", source = "staId")
    @Mapping(target = "name", source = "staName")
    @Mapping(target = "type", source = "staType")
    @Mapping(target = "latitude", source = "staLatitude")
    @Mapping(target = "longitude", source = "staLongitude")
    @Mapping(target = "cities", ignore = true)

    StateEntity toStateEntity(TStateRecord stateRecord);

    @Mapping(target = "id", source = "couId")
    @Mapping(target = "name", source = "couName")
    @Mapping(target = "states", ignore = true)
    CountryDetailEntity toEntity(TCountryRecord countryRecord);

    @AfterMapping
    default void setCitiesToState(@MappingTarget StateEntity stateEntity, Set<TCityRecord> cityRecords) {
        stateEntity.setCities(cityRecords.stream()
                .map(this::toCityEntity)
                .collect(Collectors.toSet()));
    }

    @AfterMapping
    default void setStatesToCountry(@MappingTarget CountryDetailEntity countryDetailEntity, Set<TStateRecord> stateRecords) {
        countryDetailEntity.setStates(stateRecords.stream()
                .map(this::toStateEntity)
                .collect(Collectors.toSet()));
    }
}