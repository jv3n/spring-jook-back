package com.jve.app.infrastructure.controller.mapper;

import com.jve.app.infrastructure.controller.model.dto.CountryTableRepresentation;
import com.jve.app.infrastructure.controller.model.dto.CountryTableDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryTableDtoMapper {
    CountryTableDto toDTO(CountryTableRepresentation entity);

    List<CountryTableDto> toDTOList(List<CountryTableRepresentation> domainModel);
}
