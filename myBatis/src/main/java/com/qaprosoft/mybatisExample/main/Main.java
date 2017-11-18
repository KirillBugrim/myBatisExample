package com.qaprosoft.mybatisExample.main;

import com.qaprosoft.mybatisExample.dao.mysql.impl.CityDAO;
import com.qaprosoft.mybatisExample.dao.mysql.impl.CountryDAO;
import com.qaprosoft.mybatisExample.dao.mysql.impl.UnionDAO;
import com.qaprosoft.mybatisExample.dao.mysql.interfaces.ICityDAO;
import com.qaprosoft.mybatisExample.dao.mysql.interfaces.ICountryDAO;
import com.qaprosoft.mybatisExample.dao.mysql.interfaces.IUnionDAO;
import com.qaprosoft.mybatisExample.model.City;
import com.qaprosoft.mybatisExample.model.Country;
import com.qaprosoft.mybatisExample.model.Union;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static IUnionDAO UNION_DAO = new UnionDAO();
    private final static ICountryDAO COUNTRY_DAO = new CountryDAO();
    private final static ICityDAO CITY_DAO = new CityDAO();


    public static void main(String[] args) {

//       Country country = new Country("Belarus",1000000000,3435252);
//        COUNTRY_DAO.createCountry(country);
//
//        City city = new City("Minsk",20000000,"Capital",country.getId());
//        CITY_DAO.createCity(city);
//
//
//        city = new City("Vitebsk",400000,"Kolhoz",country.getId());
//        CITY_DAO.createCity(city);
//
//        city = new City("Homel",600000,"Kolhoz",country.getId());
//        CITY_DAO.createCity(city);


        UNION_DAO.createUnion(new Union("USSR"));
        System.out.println(UNION_DAO.getUnionById(1));


    }

}
