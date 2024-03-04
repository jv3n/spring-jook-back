package com.jve.app.infrastructure.controller;

import com.jve.app.domain.country.detail.usecases.FindCountriesDetailBoundary;
import com.jve.app.infrastructure.controller.mapper.CountryDetailDtoMapper;
import com.jve.app.infrastructure.controller.model.dto.CountryDetailDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/country-detail")
public class CountryDetailController {

    private final FindCountriesDetailBoundary findCountriesDetailBoundary;
    private final CountryDetailDtoMapper mapper;

    public CountryDetailController(
            FindCountriesDetailBoundary findCountriesDetailBoundary,
            CountryDetailDtoMapper mapper) {
        this.findCountriesDetailBoundary = findCountriesDetailBoundary;
        this.mapper = mapper;
    }

    @GetMapping("{iso3}")
    public ResponseEntity<CountryDetailDto> getCountryByIso3(@PathVariable String iso3) {
        return ResponseEntity.ok().body(this.mapper.toDTO(
                this.findCountriesDetailBoundary.findByIso3(iso3)
        ));
    }
}
