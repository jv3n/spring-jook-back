package com.jve.app.infrastructure.controller.mapper;

import com.jve.app.domain.country.detail.entity.CountryDetailEntity;
import com.jve.app.infrastructure.controller.model.dto.CountryDetailDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryDetailDtoMapper {
    CountryDetailDto toDTO(CountryDetailEntity entity);
}
