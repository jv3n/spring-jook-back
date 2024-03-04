package com.jve.app.infrastructure.controller.model.dto;

import com.jve.app.domain.city.entity.CityEntity;
import com.jve.app.domain.state.entity.StateEntity;

import java.util.List;

public class CountryDetailDto {

    private Long id;
    private String name;
    private List<StateEntity> states;
    private List<CityEntity> cities;

    public CountryDetailDto() {
        /* empty */
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StateEntity> getStates() {
        return states;
    }

    public void setStates(List<StateEntity> states) {
        this.states = states;
    }

    public List<CityEntity> getCities() {
        return cities;
    }

    public void setCities(List<CityEntity> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "CountryDetailEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states=" + states +
                ", cities=" + cities +
                '}';
    }
}
