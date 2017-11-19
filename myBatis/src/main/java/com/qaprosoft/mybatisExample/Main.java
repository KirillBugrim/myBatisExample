package com.qaprosoft.mybatisExample;

import com.qaprosoft.mybatisExample.model.City;
import com.qaprosoft.mybatisExample.model.Country;
import com.qaprosoft.mybatisExample.model.Union;
import com.qaprosoft.mybatisExample.services.CityService;
import com.qaprosoft.mybatisExample.services.CountryService;
import com.qaprosoft.mybatisExample.services.UnionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dbaccess-config.xml");
        CountryService countryService = ctx.getBean(CountryService.class);
        UnionService unionService = ctx.getBean(UnionService.class);
        CityService cityService = ctx.getBean(CityService.class);



//        countryService.deleteAllCountries();
//        cityService.deleteAllCities();
//        unionService.deleteAllUnions();


//        List<Country> countries = new ArrayList<Country>();
//        countries.add(new Country("Belarus",9500000,207000));
//        countries.add(new Country("Russia",140000000,242552522));
//        countries.add(new Country("USA",300000000,14141515));
//        countries.add(new Country("Estonia",2500000,56000));
//        countries.add(new Country("England",72500000,186000));
//        countries.add(new Country("Ukraine",50000000,549000));
//        countryService.createCountries(countries);
//
//
//        List<Union> unions = new ArrayList<Union>();
//        unions.add(new Union("EU"));
//        unions.add(new Union("NATO"));
//        unions.add(new Union("UN"));
//        unions.add(new Union("WTO"));
//        unions.add(new Union("G-20"));
//        unions.add(new Union("customs union"));
//        unionService.createUnions(unions);


//        List<City> cities = new ArrayList<City>();
//        cities.add(new City("Minsk", 2000000, City.CityStatus.CAPITAL));
//        cities.add(new City("Gomel", 500000, City.CityStatus.REGIONAL_CITY));
//        cities.add(new City("Baranovichi", 200000, City.CityStatus.DISTRICT_CITY));
//        cities.add(new City("Novopolotsk", 100000, City.CityStatus.SIMPLE_CITY));
//        cityService.createCities(cities,countryService.getCountryByName("Belarus"));
//
//        List<City> cities1 = new ArrayList<City>();
//        cities1.add(new City("Moscow", 20000000, City.CityStatus.CAPITAL));
//        cities1.add(new City("Perm", 500000, City.CityStatus.REGIONAL_CITY));
//        cityService.createCities(cities1, countryService.getCountryByName("Russia"));
//
//
//        List<City> cities2 = new ArrayList<City>();
//        cities2.add(new City("Kiev", 4000000, City.CityStatus.CAPITAL));
//        cities2.add(new City("Lvov", 1000000, City.CityStatus.REGIONAL_CITY));
//        cityService.createCities(cities2, countryService.getCountryByName("Ukraine"));
//
//        List<City> cities3 = new ArrayList<City>();
//        cities3.add(new City("Washigton", 2000000, City.CityStatus.CAPITAL));
//        cities3.add(new City("New-York", 25000000, City.CityStatus.CAPITAL));
//        cityService.createCities(cities3, countryService.getCountryByName("USA"));
//
//        List<City> cities4 = new ArrayList<City>();
//        cities4.add(new City("London", 20000000, City.CityStatus.CAPITAL));
//        cities4.add(new City("Manchester", 1000000, City.CityStatus.REGIONAL_CITY));
//        cityService.createCities(cities4, countryService.getCountryByName("England"));
//
//        List<City> cities5 = new ArrayList<City>();
//        cities5.add(new City("Tallin", 700000, City.CityStatus.CAPITAL));
//        cityService.createCities(cities5, countryService.getCountryByName("Estonia"));

//        unionService.addCountryToUnion(unionService.getUnionByName("customs union"),countryService.getCountryByName("Belarus"));
//        unionService.addCountryToUnion(unionService.getUnionByName("customs union"),countryService.getCountryByName("Russia"));
//        unionService.addCountryToUnion(unionService.getUnionByName("G-20"),countryService.getCountryByName("Russia"));
//        unionService.addCountryToUnion(unionService.getUnionByName("G-20"),countryService.getCountryByName("England"));
//        unionService.addCountryToUnion(unionService.getUnionByName("G-20"),countryService.getCountryByName("USA"));
//        unionService.addCountryToUnion(unionService.getUnionByName("WTO"),countryService.getCountryByName("Russia"));
//        unionService.addCountryToUnion(unionService.getUnionByName("WTO"),countryService.getCountryByName("Ukraine"));
//        unionService.addCountryToUnion(unionService.getUnionByName("WTO"),countryService.getCountryByName("USA"));
//        unionService.addCountryToUnion(unionService.getUnionByName("WTO"),countryService.getCountryByName("England"));
//        unionService.addCountryToUnion(unionService.getUnionByName("WTO"),countryService.getCountryByName("Estonia"));
//        unionService.addCountryToUnion(unionService.getUnionByName("EU"),countryService.getCountryByName("Estonia"));
//        unionService.addCountryToUnion(unionService.getUnionByName("EU"),countryService.getCountryByName("England"));
//        unionService.addCountryToUnion(unionService.getUnionByName("NATO"),countryService.getCountryByName("USA"));
//        unionService.addCountryToUnion(unionService.getUnionByName("NATO"),countryService.getCountryByName("Estonia"));



    }

}
