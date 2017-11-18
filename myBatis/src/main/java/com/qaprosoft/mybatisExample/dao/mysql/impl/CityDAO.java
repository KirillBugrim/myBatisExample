package com.qaprosoft.mybatisExample.dao.mysql.impl;

import com.qaprosoft.mybatisExample.dao.mysql.SessionFactory;
import com.qaprosoft.mybatisExample.dao.mysql.interfaces.ICityDAO;
import com.qaprosoft.mybatisExample.model.City;
import com.qaprosoft.mybatisExample.model.Country;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CityDAO implements ICityDAO {


    public void createCity(City city) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
        session.insert("cityMapping.cityInsert", city);
        session.commit();
        } finally {
            session.close();
        }
    }



    public void createCities(List<City> cities) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
        session.insert("cityMapping.citiesInsert", cities);
        session.commit();
        } finally {
            session.close();
        }
    }

    public City getCityById(long id) {
        City city;
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
        city = session.selectOne("cityMapping.getCityById", id);
        session.commit();
        } finally {
            session.close();
        }
        return city;
    }

    @Override
    public City getCityByName(String name) {
        City city;
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            city = session.selectOne("cityMapping.getCityByName", name);
            session.commit();
        } finally {
            session.close();
        }
        return city;
    }

    public void updateCity(City city) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
        session.update("cityMapping.updateCity", city);
        session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteCityById(long id) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
        session.delete("cityMapping.deleteCityById", id);
        session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteCity(City city) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
        session.delete("cityMapping.deleteCity", city);
        session.commit();
        } finally {
            session.close();
        }
    }
}
