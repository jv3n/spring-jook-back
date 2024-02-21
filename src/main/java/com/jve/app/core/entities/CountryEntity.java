package com.jve.app.core.entities;

public class CountryEntity {

    private Long id;
    private String name;
    private String shortIsoCode;
    private String longIsoCode;
    private int countryCode;
    private Integer phoneCode;

    public CountryEntity() {
        /* empty */
    }

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

    public String getShortIsoCode() {
        return shortIsoCode;
    }

    public void setShortIsoCode(String shortIsoCode) {
        this.shortIsoCode = shortIsoCode;
    }

    public String getLongIsoCode() {
        return longIsoCode;
    }

    public void setLongIsoCode(String longIsoCode) {
        this.longIsoCode = longIsoCode;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(Integer phoneCode) {
        this.phoneCode = phoneCode;
    }

    @Override
    public String toString() {
        return "CountryEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortIsoCode='" + shortIsoCode + '\'' +
                ", longIsoCode='" + longIsoCode + '\'' +
                ", countryCode=" + countryCode +
                ", phoneCode=" + phoneCode +
                '}';
    }
}
