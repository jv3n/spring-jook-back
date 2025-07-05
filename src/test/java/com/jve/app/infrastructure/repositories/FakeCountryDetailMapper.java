package com.jve.app.infrastructure.repositories;

import com.jve.app.domain.city.entity.CityEntity;
import com.jve.app.domain.country.detail.entity.CountryDetailEntity;
import com.jve.app.domain.country.detail.entity.CountryEntity;
import com.jve.app.domain.state.entity.StateEntity;
import com.jve.app.infrastructure.repositories.mapper.CountryDetailRepositoryMapper;
import com.jve.app.tables.records.TCityRecord;
import com.jve.app.tables.records.TCountryRecord;
import com.jve.app.tables.records.TStateRecord;
import java.util.Set;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
@Primary
public class FakeCountryDetailMapper implements CountryDetailRepositoryMapper {

  @Override
  public CountryDetailEntity toCountryDetailEntity(TCountryRecord record) {
    CountryDetailEntity entity = new CountryDetailEntity();
    entity.setStates(new HashSet<>());
    return entity;
  }

  @Override
  public void setCitiesToState(StateEntity stateEntity, Set<TCityRecord> cityRecords) {
    CountryDetailRepositoryMapper.super.setCitiesToState(stateEntity, cityRecords);
  }

  @Override
  public void setStatesToCountry(CountryDetailEntity countryDetailEntity,
      Set<TStateRecord> stateRecords) {
    CountryDetailRepositoryMapper.super.setStatesToCountry(countryDetailEntity, stateRecords);
  }

  @Override
  public StateEntity toStateEntity(TStateRecord record) {
    StateEntity entity = new StateEntity();
    entity.setCities(new HashSet<>());
    return entity;
  }

  @Override
  public CountryEntity toCountryEntity(TCountryRecord rec) {
    return null;
  }

  @Override
  public CityEntity toCityEntity(TCityRecord record) {
    return new CityEntity();
  }
}
