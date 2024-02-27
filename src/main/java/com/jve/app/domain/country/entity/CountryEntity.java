package com.jve.app.domain.country.entity;

public class CountryEntity {
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

    public CountryEntity() {
        /* empty */
    }

    public Long getId() {
        return id;
    }

    public CountryEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getNativeName() {
        return nativeName;
    }

    public CountryEntity setNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    public String getIso3() {
        return iso3;
    }

    public CountryEntity setIso3(String iso3) {
        this.iso3 = iso3;
        return this;
    }

    public String getIso2() {
        return iso2;
    }

    public CountryEntity setIso2(String iso2) {
        this.iso2 = iso2;
        return this;
    }

    public Integer getNumericCode() {
        return numericCode;
    }

    public CountryEntity setNumericCode(Integer numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public CountryEntity setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public CountryEntity setCapitalName(String capitalName) {
        this.capitalName = capitalName;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public CountryEntity setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public CountryEntity setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
        return this;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public CountryEntity setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
        return this;
    }

    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    public CountryEntity setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
        return this;
    }

    public String getRegion() {
        return region;
    }

    public CountryEntity setRegion(String region) {
        this.region = region;
        return this;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public CountryEntity setRegionId(Integer regionId) {
        this.regionId = regionId;
        return this;
    }

    public String getSubregion() {
        return subregion;
    }

    public CountryEntity setSubregion(String subregion) {
        this.subregion = subregion;
        return this;
    }

    public Integer getSubregionId() {
        return subregionId;
    }

    public CountryEntity setSubregionId(Integer subregionId) {
        this.subregionId = subregionId;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public CountryEntity setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public CountryEntity setLatitude(Integer latitude) {
        this.latitude = latitude;
        return this;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public CountryEntity setLongitude(Integer longitude) {
        this.longitude = longitude;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public CountryEntity setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    public String getEmojiu() {
        return emojiu;
    }

    public CountryEntity setEmojiu(String emojiu) {
        this.emojiu = emojiu;
        return this;
    }

    @Override
    public String toString() {
        return "CountryEntity{" +
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
