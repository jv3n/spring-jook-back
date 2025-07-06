package com.jve.app.infrastructure.controller.mapper;

import com.jve.app.domain.country.entity.CountryWithState;
import com.jve.app.infrastructure.controller.model.dto.CountryDetailDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CountryDetailDtoMapper {
    CountryDetailDto toDTO(CountryWithState entity);
}
