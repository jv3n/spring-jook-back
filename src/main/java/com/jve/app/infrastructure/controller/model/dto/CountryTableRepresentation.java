package com.jve.app.infrastructure.controller.model.dto;

public class CountryTableRepresentation {
    private Long id;
    private String name;
    private String iso3;
    private Integer numericCode;
    private String capitalName;
    private String currency;
    private String region;
    private String subregion;
    private String latitudeLongitude;
    private String emoji;

    public CountryTableRepresentation() {
        /* empty */
    }

    public Long getId() {
        return id;
    }

    public CountryTableRepresentation setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryTableRepresentation setName(String name) {
        this.name = name;
        return this;
    }

    public String getIso3() {
        return iso3;
    }

    public CountryTableRepresentation setIso3(String iso3) {
        this.iso3 = iso3;
        return this;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public CountryTableRepresentation setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public CountryTableRepresentation setCapitalName(String capitalName) {
        this.capitalName = capitalName;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CountryTableRepresentation setCurrency(String currency, String currencyName, String symbol) {
        this.currency = currency + " | " + currencyName + " | " + symbol;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public CountryTableRepresentation setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getSubregion() {
        return subregion;
    }

    public CountryTableRepresentation setSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    public String getLatitudeLongitude() {
        return latitudeLongitude;
    }

    public CountryTableRepresentation setLatitudeLongitude(Integer latitude, Integer longitude) {
        this.latitudeLongitude = latitude + "," + longitude;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public CountryTableRepresentation setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    @Override
    public String toString() {
        return "CountryTable{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", numericCode=" + numericCode +
                ", capitalName='" + capitalName + '\'' +
                ", currency='" + currency + '\'' +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", latitudeLongitude=" + latitudeLongitude +
                ", emoji='" + emoji + '\'' +
                '}';
    }
}
