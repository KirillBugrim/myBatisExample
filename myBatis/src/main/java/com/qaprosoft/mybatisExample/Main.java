package com.qaprosoft.mybatisExample;

import com.qaprosoft.mybatisExample.model.Country;
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

        System.out.println(unionService.getUnionById(1));


    }

}
