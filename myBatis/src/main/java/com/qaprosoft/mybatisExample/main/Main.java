package com.qaprosoft.mybatisExample.main;

import com.qaprosoft.mybatisExample.dao.mysql.interfaces.CountryMapper;
import com.qaprosoft.mybatisExample.dao.mysql.interfaces.UnionMapper;
import com.qaprosoft.mybatisExample.model.Country;
import com.qaprosoft.mybatisExample.model.Union;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {



    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dbaccess-config.xml");
        CountryMapper unionMapper = ctx.getBean(CountryMapper.class);
        unionMapper.createCountry(new Country("Zimbabwe",2424,2424));


    }

}
