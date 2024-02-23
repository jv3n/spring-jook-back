package com.jve.app.infrastructure.controllers;

import com.jve.app.core.usecases.findallcountries.FindCountriesBoundary;
import com.jve.app.core.usecases.findallcountries.model.dto.CountryDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@ApiResponses
@RestController
@RequestMapping("api")
public class CountryController {
    private final FindCountriesBoundary findAllCountriesBoundary;

    public CountryController(FindCountriesBoundary findAllCountriesBoundary) {
        this.findAllCountriesBoundary = findAllCountriesBoundary;
    }

    @Operation
    @GetMapping("countries")
    public ResponseEntity<List<CountryDTO>> getCountries() {
        return ResponseEntity.ok().body(findAllCountriesBoundary.findAll());
    }

    @Operation
    @GetMapping("country/{name}")
    public ResponseEntity<CountryDTO> getByName(@PathVariable String name) {
        CountryDTO dto = findAllCountriesBoundary.findByName(name);
        return ResponseEntity.ok().body(dto);
    }
}
