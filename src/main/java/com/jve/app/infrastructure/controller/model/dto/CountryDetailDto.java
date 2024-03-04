package com.jve.app.infrastructure.controller.model.dto;

import java.util.List;

public class CountryDetailDto {

    private Long id;
    private String name;
    private List<StateDto> states;

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

    public List<StateDto> getStates() {
        return states;
    }

    public void setStates(List<StateDto> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "CountryDetailDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states=" + states +
                '}';
    }
}
