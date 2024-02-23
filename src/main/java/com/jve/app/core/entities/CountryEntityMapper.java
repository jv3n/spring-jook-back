package com.jve.app.core.entities;

import com.jve.app.core.usecases.findallcountries.model.dto.CountryDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryEntityMapper {
    CountryDTO toDTO(CountryEntity entity);
    List<CountryDTO> toDTOList(List<CountryEntity> entity);
}
