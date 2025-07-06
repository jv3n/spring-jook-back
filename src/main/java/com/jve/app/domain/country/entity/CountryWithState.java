package com.jve.app.domain.country.entity;

import com.jve.app.domain.state.entity.StateEntity;

import java.util.HashSet;
import java.util.Set;

public class CountryWithState {

    private Country country;
    private Set<StateEntity> states = new HashSet<>();

    public CountryWithState() {
        /* empty */
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
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
