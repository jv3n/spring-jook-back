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

    public Long getId() {
        return id;
    }

    public CountryDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CountryDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getShortIsoCode() {
        return shortIsoCode;
    }

    public CountryDTO setShortIsoCode(String shortIsoCode) {
        this.shortIsoCode = shortIsoCode;
        return this;
    }

    public String getLongIsoCode() {
        return longIsoCode;
    }

    public CountryDTO setLongIsoCode(String longIsoCode) {
        this.longIsoCode = longIsoCode;
        return this;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public CountryDTO setCountryCode(int countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Integer getPhoneCode() {
        return phoneCode;
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
