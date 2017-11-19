package com.qaprosoft.mybatisExample.interfaces;

import com.qaprosoft.mybatisExample.model.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CityMapper {

    void createCity(@Param("city") City city, @Param("countryId") long countryId);

    void createCities(@Param("city") List<City> cities, @Param("countryId") long countryId);

    City getCityById(long id);

    City getCityByName(String name);

    void updateCity(City city);

    void deleteCityById(long id);

    void deleteCity(City city);

    Long getCountAllCities();

    void deleteAllCities();
}
