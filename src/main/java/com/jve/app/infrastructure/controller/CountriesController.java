package com.jve.app.infrastructure.controller;

import com.jve.app.domain.country.usecases.CountriesUsescases;
import com.jve.app.infrastructure.controller.mapper.CountryDetailDtoMapper;
import com.jve.app.infrastructure.controller.model.PageResult;
import com.jve.app.infrastructure.controller.model.command.CountriesSearchRequest;
import com.jve.app.infrastructure.controller.model.dto.CountryDetailDto;
import com.jve.app.infrastructure.controller.model.dto.CountryTableRepresentation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/countries")
public class CountriesController {

  private final CountriesUsescases countriesUsescases;
  private final CountryDetailDtoMapper countryDetailDtoMapper;

  public CountriesController(
      CountriesUsescases countriesUsescases,
      CountryDetailDtoMapper countryDetailDtoMapper
  ) {
    this.countriesUsescases = countriesUsescases;
    this.countryDetailDtoMapper = countryDetailDtoMapper;
  }

  @PostMapping()
  public ResponseEntity<PageResult<CountryTableRepresentation>> search(@RequestBody CountriesSearchRequest request) {
    return ResponseEntity.ok(countriesUsescases.search(request));
  }

  @GetMapping("{iso3}")
  public ResponseEntity<CountryDetailDto> getCountryByIso3(@PathVariable String iso3) {
    return ResponseEntity.ok().body(this.countryDetailDtoMapper.toDTO(
        this.countriesUsescases.findByIso3(iso3)
    ));
  }
}
