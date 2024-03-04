package com.jve.app.domain.country.detail.entity;

import com.jve.app.domain.state.entity.StateEntity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountryDetailEntity {

    private Long id;
    private String name;
    private Set<StateEntity> states = new HashSet<>();;

    public CountryDetailEntity() {
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

    public Set<StateEntity> getStates() {
        return states;
    }

    public void setStates(Set<StateEntity> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "CountryDetailEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", states=" + states +
                '}';
    }
}
