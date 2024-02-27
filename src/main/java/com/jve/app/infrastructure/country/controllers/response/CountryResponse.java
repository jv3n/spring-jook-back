package com.jve.app.infrastructure.country.controllers.response;

public class CountryResponse {

    private Long id;
    private String name;
    private String nativeName;
    private String iso3;
    private String iso2;
    private Integer numericCode;
    private String phoneCode;
    private String capitalName;
    private String currency;
    private String currencyName;
    private String currencySymbol;
    private String topLevelDomain;
    private String region;
    private Integer regionId;
    private String subregion;
    private Integer subregionId;
    private String nationality;
    private Integer latitude;
    private Integer longitude;
    private String emoji;
    private String emojiu;

    public CountryResponse() {
        /* empty */
    }

    public Long getId() {
        return id;
    }

    public CountryResponse setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getNativeName() {
        return nativeName;
    }

    public CountryResponse setNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    public String getIso3() {
        return iso3;
    }

    public CountryResponse setIso3(String iso3) {
        this.iso3 = iso3;
        return this;
    }

    public String getIso2() {
        return iso2;
    }

    public CountryResponse setIso2(String iso2) {
        this.iso2 = iso2;
        return this;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public CountryResponse setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public CountryResponse setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public CountryResponse setCapitalName(String capitalName) {
        this.capitalName = capitalName;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CountryResponse setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public CountryResponse setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
        return this;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public CountryResponse setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
        return this;
    }

    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    public CountryResponse setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public CountryResponse setRegion(String region) {
        this.region = region;
        return this;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public CountryResponse setRegionId(Integer regionId) {
        this.regionId = regionId;
        return this;
    }

    public String getSubregion() {
        return subregion;
    }

    public CountryResponse setSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    public Integer getSubregionId() {
        return subregionId;
    }

    public CountryResponse setSubregionId(Integer subregionId) {
        this.subregionId = subregionId;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public CountryResponse setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public CountryResponse setLatitude(Integer latitude) {
        this.latitude = latitude;
        return this;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public CountryResponse setLongitude(Integer longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public CountryResponse setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    public String getEmojiu() {
        return emojiu;
    }

    public CountryResponse setEmojiu(String emojiu) {
        this.emojiu = emojiu;
        return this;
    }

    @Override
    public String toString() {
        return "CountryResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nativeName='" + nativeName + '\'' +
                ", iso3='" + iso3 + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", numericCode=" + numericCode +
                ", phoneCode='" + phoneCode + '\'' +
                ", capitalName='" + capitalName + '\'' +
                ", currency='" + currency + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", currencySymbol='" + currencySymbol + '\'' +
                ", topLevelDomain='" + topLevelDomain + '\'' +
                ", region='" + region + '\'' +
                ", regionId=" + regionId +
                ", subregion='" + subregion + '\'' +
                ", subregionId=" + subregionId +
                ", nationality='" + nationality + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", emoji='" + emoji + '\'' +
                ", emojiu='" + emojiu + '\'' +
                '}';
    }
}
