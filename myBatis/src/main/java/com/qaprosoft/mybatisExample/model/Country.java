package com.qaprosoft.mybatisExample.model;

import java.util.List;

public class Country {

    private Long id;
    private String name;
    private Long population;
    private Long area;
    private List<City> cities;
    private List<Union> unions;

    public Country(String name, long population, long area, List<City> cities, List<Union> unions) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.cities = cities;
        this.unions = unions;
    }

    public Country(String name, Long population, Long area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public Country(Long id, String name, Long population, Long area) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public Country(Long id, String name,Long area) {
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

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
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
                ", name='" + name +
                ", population=" + population +
                ", area=" + area +'\n' +
                ", cities=" + cities +'\n' +
                ", unions=" + unions +
                '}';
    }
}
