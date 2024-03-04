package com.jve.app.infrastructure.controller.model.dto;


import java.util.Objects;

public class CountryTableDto {

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

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getLatitudeLongitude() {
        return latitudeLongitude;
    }

    public void setLatitudeLongitude(String latitudeLongitude) {
        this.latitudeLongitude = latitudeLongitude;
    }

    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryTableDto that = (CountryTableDto) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(iso3, that.iso3) && Objects.equals(numericCode, that.numericCode) && Objects.equals(capitalName, that.capitalName) && Objects.equals(currency, that.currency) && Objects.equals(region, that.region) && Objects.equals(subregion, that.subregion) && Objects.equals(latitudeLongitude, that.latitudeLongitude) && Objects.equals(emoji, that.emoji);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, iso3, numericCode, capitalName, currency, region, subregion, latitudeLongitude, emoji);
    }

    @Override
    public String toString() {
        return "CountryTableDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", numericCode=" + numericCode +
                ", capitalName='" + capitalName + '\'' +
                ", currency='" + currency + '\'' +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", latitudeLongitude='" + latitudeLongitude + '\'' +
                ", emoji='" + emoji + '\'' +
                '}';
    }
}
