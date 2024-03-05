package com.jve.app.domain.country.detail.entity;

import com.jve.app.domain.state.entity.StateEntity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountryDetailEntity {

    private CountryEntity country;
    private Set<StateEntity> states = new HashSet<>();

    public CountryDetailEntity() {
        /* empty */
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
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
                "country=" + country +
                ", states=" + states +
                '}';
    }
}
