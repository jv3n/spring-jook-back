package com.jve.app.infrastructure.controllers;

import com.jve.app.core.usecases.findallcountries.FindCountriesBoundary;
import com.jve.app.core.usecases.findallcountries.model.dto.CountryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class CountryController {
    private final FindCountriesBoundary findAllCountriesBoundary;

    public CountryController(FindCountriesBoundary findAllCountriesBoundary) {
        this.findAllCountriesBoundary = findAllCountriesBoundary;
    }

    @GetMapping("countries")
    public ResponseEntity<List<CountryDTO>> getCountries() {
        return ResponseEntity.ok().body(findAllCountriesBoundary.findAll());
    }
}
