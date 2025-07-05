package com.jve.app.infrastructure.repositories;

import com.jve.app.domain.country.detail.entity.CountryDetailEntity;
import com.jve.app.domain.state.entity.StateEntity;
import java.math.BigDecimal;
import org.jooq.DSLContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jooq.JooqTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import static com.jve.app.Tables.*;
import static org.assertj.core.api.Assertions.assertThat;

@JooqTest
@Import({CountryDetailRepository.class, FakeCountryDetailMapper.class})
@ActiveProfiles("test")
class CountryDetailRepositoryTest {

  @Autowired
  DSLContext dsl;

  @Autowired
  CountryDetailRepository repository;

  @BeforeEach
  void insertTestData() {
    dsl.deleteFrom(T_CITY).execute();
    dsl.deleteFrom(T_STATE).execute();
    dsl.deleteFrom(T_COUNTRY).execute();

    dsl.insertInto(T_COUNTRY)
        .set(T_COUNTRY.COU_ID, BigDecimal.valueOf(1L))
        .set(T_COUNTRY.COU_ISO3, "CAN")
        .set(T_COUNTRY.COU_NAME, "Canada")
        .set(T_COUNTRY.COU_ISO2, "CA")
        .set(T_COUNTRY.COU_NUMERIC_CODE, BigDecimal.valueOf(124L))
        .set(T_COUNTRY.COU_PHONE_CODE, "1234")
        .execute();

    dsl.insertInto(T_STATE)
        .set(T_STATE.STA_ID, BigDecimal.valueOf(10L))
        .set(T_STATE.STA_COUNTRY_ID, BigDecimal.valueOf(1L))
        .set(T_STATE.STA_NAME, "Quebec")
        .set(T_STATE.STA_COUNTRY_CODE, "CA")
        .set(T_STATE.STA_COUNTRY_NAME, "Canada")
        .set(T_STATE.STA_STATE_CODE, "QC")
        .execute();

    dsl.insertInto(T_CITY)
        .set(T_CITY.CTY_ID, BigDecimal.valueOf(100L))
        .set(T_CITY.CTY_STATE_ID, BigDecimal.valueOf(10L))
        .set(T_CITY.CTY_NAME, "Montreal")
        .set(T_CITY.CTY_STATE_CODE, "QC")
        .set(T_CITY.CTY_STATE_NAME, "Quebec")
        .set(T_CITY.CTY_COUNTRY_ID, BigDecimal.valueOf(1L))
        .set(T_CITY.CTY_COUNTRY_CODE, "CA")
        .set(T_CITY.CTY_COUNTRY_NAME, "Canada")
        .execute();
  }

  @Test
  void shouldLoadCountryWithStatesAndCities() {
    CountryDetailEntity result = repository.findByIso3("CAN");

    assertThat(result).isNotNull();
    assertThat(result.getStates()).hasSize(1);
    StateEntity state = result.getStates().iterator().next();
    assertThat(state.getCities()).hasSize(1);
  }
}
