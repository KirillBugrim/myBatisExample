package com.qaprosoft.mybatisExample.dao.mysql.impl;

import com.qaprosoft.mybatisExample.dao.mysql.SessionFactory;
import com.qaprosoft.mybatisExample.dao.mysql.interfaces.ICountryDAO;
import com.qaprosoft.mybatisExample.model.Country;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CountryDAO implements ICountryDAO {


    public void createCountry(Country country) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.insert("countryMapping.countryInsert", country);
            session.commit();
        } finally {
            session.close();
        }
    }

    @Override
    public void createCountries(List<Country> countries) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.insert("countryMapping.createCountries", countries);
            session.commit();
        } finally {
            session.close();
        }
    }

    public Country getCountryById(long id) {
        Country country;
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            country = session.selectOne("countryMapping.getCountryById", id);
            session.commit();
        } finally {
            session.close();
        }
        return country;
    }

    public void updateCountry(Country country) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.update("countryMapping.updateCountry", country);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteCountryById(long id) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.delete("countryMapping.deleteCountryById", id);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void deleteCountry(Country country) {
        SqlSession session = null;
        try {
            session = SessionFactory.getSession();
            session.delete("countryMapping.deleteCountry", country);
            session.commit();
        } finally {
            session.close();
        }
    }

}
