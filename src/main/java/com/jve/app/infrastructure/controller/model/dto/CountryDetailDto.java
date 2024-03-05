package com.jve.app.infrastructure.controller.model.dto;

import java.util.HashSet;
import java.util.Set;

public class CountryDetailDto {

    private CountryDto country;
    private Set<StateDto> states = new HashSet<>();

    public CountryDetailDto() {
        /* empty */
    }

    public CountryDto getCountry() {
        return country;
    }

    public void setCountry(CountryDto country) {
        this.country = country;
    }

    public Set<StateDto> getStates() {
        return states;
    }

    public void setStates(Set<StateDto> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "CountryDetailDto{" +
                "country=" + country +
                ", states=" + states +
                '}';
    }
}
