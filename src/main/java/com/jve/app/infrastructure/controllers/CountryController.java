package com.jve.app.infrastructure.controllers;

import com.jve.app.core.usecases.findallcountries.FindCountriesBoundary;
import com.jve.app.core.usecases.findallcountries.model.dto.CountryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
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

    @GetMapping("country/{name}")
    public ResponseEntity<CountryDTO> getByName(@PathVariable String name) {
        CountryDTO dto = findAllCountriesBoundary.findByName(name);
        return ResponseEntity.ok().body(dto);
    }
}
