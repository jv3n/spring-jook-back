package com.jve.app.infrastructure.controller;

import com.jve.app.domain.country.table.usecases.FindCountriesTableBoundary;
import com.jve.app.infrastructure.controller.mapper.CountryTableDtoMapper;
import com.jve.app.infrastructure.controller.model.dto.CountryTableDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/country-table")
public class CountryTableController {

    private final FindCountriesTableBoundary findAllCountriesBoundary;
    private final CountryTableDtoMapper mapper;

    public CountryTableController(
            FindCountriesTableBoundary findAllCountriesBoundary,
            CountryTableDtoMapper mapper) {
        this.findAllCountriesBoundary = findAllCountriesBoundary;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<CountryTableDto>> getCountries() {
        return ResponseEntity.ok().body(this.mapper.toDTOList(this.findAllCountriesBoundary.findAll()));
    }
}
