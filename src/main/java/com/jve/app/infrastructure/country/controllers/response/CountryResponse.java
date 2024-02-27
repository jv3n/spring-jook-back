package com.jve.app.infrastructure.country.controllers.response;

public class CountryResponse {

    private Long id;
    private String name;
    private String shortIsoCode;
    private String longIsoCode;
    private int countryCode;


    private Integer phoneCode;

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

    public String getShortIsoCode() {
        return shortIsoCode;
    }

    public CountryResponse setShortIsoCode(String shortIsoCode) {
        this.shortIsoCode = shortIsoCode;
        return this;
    }

    public String getLongIsoCode() {
        return longIsoCode;
    }

    public CountryResponse setLongIsoCode(String longIsoCode) {
        this.longIsoCode = longIsoCode;
        return this;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public CountryResponse setCountryCode(int countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Integer getPhoneCode() {
        return phoneCode;
    }


    public CountryResponse setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
        return this;
    }

    @Override
    public String toString() {
        return "CountryResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortIsoCode='" + shortIsoCode + '\'' +
                ", longIsoCode='" + longIsoCode + '\'' +
                ", countryCode=" + countryCode +
                ", phoneCode=" + phoneCode +
                '}';
    }
}
