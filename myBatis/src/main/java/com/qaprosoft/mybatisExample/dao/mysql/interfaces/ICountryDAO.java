package com.qaprosoft.mybatisExample.dao.mysql.interfaces;

import com.qaprosoft.mybatisExample.model.Country;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICountryDAO {

    void createCountry(Country country);

    void createCountries(List<Country> countries);

    Country getCountryById(long id);

    void updateCountry(Country country);

    void deleteCountryById(long id);

    void deleteCountry(Country country);

}
