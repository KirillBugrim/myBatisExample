package com.qaprosoft.mybatisExample;

import com.qaprosoft.mybatisExample.model.City;
import com.qaprosoft.mybatisExample.model.Country;
import com.qaprosoft.mybatisExample.model.Union;
import com.qaprosoft.mybatisExample.services.CityService;
import com.qaprosoft.mybatisExample.services.CountryService;
import com.qaprosoft.mybatisExample.services.UnionService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {



    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dbaccess-config.xml");
        CountryService countryService = ctx.getBean(CountryService.class);
        UnionService unionService = ctx.getBean(UnionService.class);
        CityService cityService = ctx.getBean(CityService.class);



//        countryService.createCountry(new Country("ddsf",32424,4224));
//        unionService.createUnion(new Union("dsf"));

unionService.addCountryToUnion(1, 1);


    }

}
