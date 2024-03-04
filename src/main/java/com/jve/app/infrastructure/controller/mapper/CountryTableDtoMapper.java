package com.jve.app.infrastructure.controller.mapper;

import com.jve.app.domain.country.table.domainobject.CountryTable;
import com.jve.app.domain.country.table.entity.CountryTableEntity;
import com.jve.app.infrastructure.controller.model.dto.CountryTableDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryTableDtoMapper {
    CountryTableDto toDTO(CountryTable entity);

    List<CountryTableDto> toDTOList(List<CountryTable> domainModel);
}
