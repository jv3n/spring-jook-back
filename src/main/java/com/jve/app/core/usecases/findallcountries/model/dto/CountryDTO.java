package com.jve.app.core.usecases.findallcountries.model.dto;

public class CountryDTO {

    private Long id;
    private String name;
    private String shortIsoCode;
    private String longIsoCode;
    private int countryCode;
    private Integer phoneCode;

    public CountryDTO() {
        /* empty */
    }

    public CountryDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public CountryDTO setName(String name) {
        this.name = name;
        return this;
    }

    public CountryDTO setShortIsoCode(String shortIsoCode) {
        this.shortIsoCode = shortIsoCode;
        return this;
    }

    public CountryDTO setLongIsoCode(String longIsoCode) {
        this.longIsoCode = longIsoCode;
        return this;
    }

    public CountryDTO setCountryCode(int countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public CountryDTO setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    @Override
    public String toString() {
        return "CountryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortIsoCode='" + shortIsoCode + '\'' +
                ", longIsoCode='" + longIsoCode + '\'' +
                ", countryCode=" + countryCode +
                ", phoneCode=" + phoneCode +
                '}';
    }
}
