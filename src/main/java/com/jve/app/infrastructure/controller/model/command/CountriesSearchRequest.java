package com.jve.app.infrastructure.controller.model.command;

public record CountriesSearchRequest(
    String name,
    String iso3,
    String region,
    String subregion,
    PageRequest pageRequest,
    SortRequest sortRequest
) {}
