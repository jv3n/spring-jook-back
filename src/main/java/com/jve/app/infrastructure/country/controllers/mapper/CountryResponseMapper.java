package com.jve.app.infrastructure.country.controllers.mapper;

import com.jve.app.domain.country.entity.CountryEntity;
import com.jve.app.infrastructure.country.controllers.response.CountryResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryResponseMapper {
    CountryResponse toDTO(CountryEntity entity);
    List<CountryResponse> toDTOList(List<CountryEntity> entity);
}
