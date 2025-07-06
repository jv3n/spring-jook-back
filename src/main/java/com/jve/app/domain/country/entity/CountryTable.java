package com.jve.app.domain.country.entity;

public class CountryTable {
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

    public CountryTable() {
        /* empty */
    }

    public Long getId() {
        return id;
    }

    public CountryTable setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryTable setName(String name) {
        this.name = name;
        return this;
    }

    public String getIso3() {
        return iso3;
    }

    public CountryTable setIso3(String iso3) {
        this.iso3 = iso3;
        return this;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public CountryTable setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public CountryTable setCapitalName(String capitalName) {
        this.capitalName = capitalName;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CountryTable setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public CountryTable setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
        return this;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public CountryTable setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public CountryTable setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getSubregion() {
        return subregion;
    }

    public CountryTable setSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public CountryTable setLatitude(Integer latitude) {
        this.latitude = latitude;
        return this;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public CountryTable setLongitude(Integer longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public CountryTable setEmoji(String emoji) {
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
