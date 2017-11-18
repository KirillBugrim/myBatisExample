package com.qaprosoft.mybatisExample.services;

import com.qaprosoft.mybatisExample.interfaces.CityMapper;
import com.qaprosoft.mybatisExample.model.City;
import com.qaprosoft.mybatisExample.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    @Transactional(rollbackFor = Exception.class)
    public void createCity(City city, Country country){
    cityMapper.createCity(city, country.getId());
    }

    @Transactional(rollbackFor = Exception.class)
    public void createCities(List<City> cities){
        cityMapper.createCities(cities);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCity(City city){
        cityMapper.deleteCity(city);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteCityBuId(long id){
        cityMapper.deleteCityById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateCity(City city){
        cityMapper.updateCity(city);
    }

    @Transactional(readOnly = true)
    public City getCityById(long id){
       return cityMapper.getCityById(id);
    }

    @Transactional(readOnly = true)
    public City getCityByName(String name){
        return cityMapper.getCityByName(name);
    }

}
