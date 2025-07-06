package com.jve.app.infrastructure.controller;

import com.jve.app.domain.country.usecases.CountriesUsescases;
import com.jve.app.infrastructure.controller.mapper.CountryDetailDtoMapper;
import com.jve.app.infrastructure.controller.mapper.CountryTableDtoMapper;
import com.jve.app.infrastructure.controller.model.dto.CountryDetailDto;
import com.jve.app.infrastructure.controller.model.dto.CountryTableDto;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/countries")
public class CountriesController {

  private final CountriesUsescases countriesUsescases;
  private final CountryTableDtoMapper countryTableDtoMapper;
  private final CountryDetailDtoMapper countryDetailDtoMapper;

  public CountriesController(
      CountriesUsescases countriesUsescases,
      CountryTableDtoMapper countryTableDtoMapper,
      CountryDetailDtoMapper countryDetailDtoMapper
  ) {
    this.countriesUsescases = countriesUsescases;
    this.countryTableDtoMapper = countryTableDtoMapper;
    this.countryDetailDtoMapper = countryDetailDtoMapper;
  }

  @GetMapping
  public ResponseEntity<List<CountryTableDto>> search() {
    return ResponseEntity.ok().body(this.countryTableDtoMapper.toDTOList(this.countriesUsescases.findAll()));
  }

  @GetMapping("{iso3}")
  public ResponseEntity<CountryDetailDto> getCountryByIso3(@PathVariable String iso3) {
    return ResponseEntity.ok().body(this.countryDetailDtoMapper.toDTO(
        this.countriesUsescases.findByIso3(iso3)
    ));
  }
}
