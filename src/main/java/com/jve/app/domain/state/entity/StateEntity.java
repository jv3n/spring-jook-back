package com.jve.app.domain.state.entity;

import com.jve.app.domain.city.entity.CityEntity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StateEntity {

    private String id;
    private String name;
    private String type;
    private Integer latitude;
    private Integer longitude;
    private Set<CityEntity> cities = new HashSet<>();

    public StateEntity() {
        /* empty */
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Set<CityEntity> getCities() {
        return cities;
    }

    public void setCities(Set<CityEntity> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "StateEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", cities=" + cities +
                '}';
    }
}
