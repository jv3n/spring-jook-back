package com.jve.app.domain.country.table.entity;

public class CountryTableEntity {
    private Long id;
    private String name;
    private String iso3;
    private Integer numericCode;
    private String capitalName;
    private String currency;
    private String currencyName;
    private String currencySymbol;
    private String region;
    private String subregion;
    private Integer latitude;
    private Integer longitude;
    private String emoji;

    public CountryTableEntity() {
        /* empty */
    }

    public Long getId() {
        return id;
    }

    public CountryTableEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryTableEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getIso3() {
        return iso3;
    }

    public CountryTableEntity setIso3(String iso3) {
        this.iso3 = iso3;
        return this;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public CountryTableEntity setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public CountryTableEntity setCapitalName(String capitalName) {
        this.capitalName = capitalName;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CountryTableEntity setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public CountryTableEntity setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
        return this;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public CountryTableEntity setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public CountryTableEntity setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getSubregion() {
        return subregion;
    }

    public CountryTableEntity setSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public CountryTableEntity setLatitude(Integer latitude) {
        this.latitude = latitude;
        return this;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public CountryTableEntity setLongitude(Integer longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public CountryTableEntity setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    @Override
    public String toString() {
        return "CountryTableEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", numericCode=" + numericCode +
                ", capitalName='" + capitalName + '\'' +
                ", currency='" + currency + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", currencySymbol='" + currencySymbol + '\'' +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", emoji='" + emoji + '\'' +
                '}';
    }
}
