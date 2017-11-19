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


//
//        Union union = new Union("SNG");
//        Union union1 = new Union("Tamozhenyi soyuz");
//
//
//        List<Union> unions = new ArrayList<Union>();
//        unions.add(union);
//        unions.add(union1);
//        unionService.createUnions(unions);
//
//
//        Country country = new Country("Belarus",242424,42424);
//
//        countryService.createCountry(country);

        unionService.addCountryToUnion(2,1);




    }

}
