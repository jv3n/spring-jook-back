package com.jve.app.infrastructure.country.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jve.app.domain.country.entity.CountryEntity;
import com.jve.app.domain.country.usecases.findallcountries.FindCountriesBoundary;
import com.jve.app.infrastructure.country.controllers.mapper.CountryResponseMapper;
import com.jve.app.infrastructure.country.controllers.response.CountryResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CountryController.class)
class CountryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private FindCountriesBoundary usecase;

    @MockBean
    private CountryResponseMapper mapper;

    @Test
    void getByName() throws Exception {
        CountryResponse expectedUsa = new CountryResponse()
                .setId(1L)
                .setName("United States")
                .setNativeName("United States")
                .setIso3("USA")
                .setIso2("US")
                .setNumericCode(840)
                .setPhoneCode("1")
                .setCapitalName("Washington, D.C.")
                .setCurrency("USD")
                .setCurrencyName("United States dollar")
                .setCurrencySymbol("$")
                .setTopLevelDomain(".us")
                .setRegion("Americas")
                .setRegionId(1)
                .setSubregion("North America")
                .setSubregionId(1)
                .setNationality("American")
                .setLatitude(38)
                .setLongitude(-77)
                .setEmoji("🇺🇸")
                .setEmojiu("U+1F1FA U+1F1F8");

        when(usecase.findByName(expectedUsa.getName())).thenReturn(new CountryEntity());
        when(mapper.toDTO(any(CountryEntity.class))).thenReturn(expectedUsa);

        var res = mockMvc.perform(MockMvcRequestBuilders.get("/api/country/{name}", expectedUsa.getName()))
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andReturn();

        // Convert the response content to a CountryResponse object
        CountryResponse actualResponse = objectMapper.readValue(res.getResponse().getContentAsString(), CountryResponse.class);

        // Then compare with assertThat
        assertThat(actualResponse).isEqualToComparingFieldByField(expectedUsa);
    }
}