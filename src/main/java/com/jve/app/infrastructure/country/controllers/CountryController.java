package com.jve.app.infrastructure.country.controllers;

import com.jve.app.domain.country.usecases.findallcountries.FindCountriesBoundary;
import com.jve.app.infrastructure.country.controllers.mapper.CountryResponseMapper;
import com.jve.app.infrastructure.country.controllers.response.CountryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:4200/")
@RestController
@RequestMapping("api")
public class CountryController {
    private final FindCountriesBoundary findAllCountriesBoundary;
    private final CountryResponseMapper mapper;

    public CountryController(FindCountriesBoundary findAllCountriesBoundary, CountryResponseMapper mapper) {
        this.findAllCountriesBoundary = findAllCountriesBoundary;
        this.mapper = mapper;
    }

    @GetMapping("countries")
    public ResponseEntity<List<CountryResponse>> getCountries() {
        return ResponseEntity.ok().body(this.mapper.toDTOList(this.findAllCountriesBoundary.findAll()));
    }

    @GetMapping("country/{name}")
    public ResponseEntity<CountryResponse> getByName(@PathVariable String name) {
        return ResponseEntity.ok().body(this.mapper.toDTO(this.findAllCountriesBoundary.findByName(name)));
    }
}
