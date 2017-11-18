package com.qaprosoft.mybatisExample.services;

import com.qaprosoft.mybatisExample.interfaces.CountryMapper;
import com.qaprosoft.mybatisExample.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.PostConstruct;

@Service
public class CountryService {

    @Autowired
    private CountryMapper countryMapper;

    @Transactional(rollbackFor = Exception.class)
    public void createCountry(Country country){
        countryMapper.createCountry(country);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCountry(Country country){
        countryMapper.deleteCountry(country);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateCountry(Country country){
        countryMapper.updateCountry(country);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCountryById(long id){
       countryMapper.deleteCountryById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public Country getCountryById(long id){
        return countryMapper.getCountryById(id);
    }
}
