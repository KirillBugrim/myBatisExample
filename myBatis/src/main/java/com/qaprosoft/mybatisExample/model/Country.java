package com.qaprosoft.mybatisExample.model;

import java.util.List;

public class Country {

    private long id;
    private String name;
    private long population;
    private long area;
    private List<City> cities;
    private List<Union> unions;

    public Country(String name, long population, long area, List<City> cities, List<Union> unions) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.cities = cities;
        this.unions = unions;
    }

    public Country(String name, long population, long area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public Country(long id, String name, long population, long area) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public Country(long id, String name,  long area) {
        this.id = id;
        this.name = name;
        this.area = area;
    }

    public Country() {
    }

    public List<Union> getUnions() {
        return unions;
    }

    public void setUnions(List<Union> unions) {
        this.unions = unions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public long getArea() {
        return area;
    }

    public void setArea(long area) {
        this.area = area;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }


    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", cities=" + cities +
                ", unions=" + unions +
                '}';
    }
}
