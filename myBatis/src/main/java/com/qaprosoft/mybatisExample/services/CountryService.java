package com.qaprosoft.mybatisExample.services;

import com.qaprosoft.mybatisExample.interfaces.CountryMapper;
import com.qaprosoft.mybatisExample.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Transactional(rollbackFor = Exception.class)
    public void createCountry(Country country) {
        countryMapper.createCountry(country);
    }

    @Transactional(rollbackFor = Exception.class)
    public void createCountries(List<Country> countries) {
        countryMapper.createCountries(countries);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCountry(Country country) {
        countryMapper.deleteCountry(country);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateCountry(Country country) {
        countryMapper.updateCountry(country);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCountryById(long id) {
        countryMapper.deleteCountryById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public Country getCountryById(long id) {
        return countryMapper.getCountryById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public Country getCountryByName(String name) {
        return countryMapper.getCountryByName(name);
    }

    @Transactional(readOnly = true)
    public Long getCountAllCountries() {
        return countryMapper.getCountAllCountries();
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteAllCountries () {
        countryMapper.deleteAllCountries();
    }
}
