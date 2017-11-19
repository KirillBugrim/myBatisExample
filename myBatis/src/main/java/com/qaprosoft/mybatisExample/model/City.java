package com.qaprosoft.mybatisExample.model;

public class City {

    private long id;
    private String name;
    private long cityPopulation;
    private CityStatus cityStatus;


    public enum CityStatus{
        CAPITAL,REGIONAL_CITY,DISTRICT_CITY,SIMPLE_CITY

    }

    public City() {
    }

    public City(String name, long cityPopulation, CityStatus cityStatus) {
        this.name = name;
        this.cityPopulation = cityPopulation;
        this.cityStatus = cityStatus;
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

    public long getCityPopulation() {
        return cityPopulation;
    }

    public void setCityPopulation(long cityPopulation) {
        this.cityPopulation = cityPopulation;
    }

    public CityStatus getCityStatus() {
        return cityStatus;
    }

    public void setCityStatus(CityStatus cityStatus) {
        this.cityStatus = cityStatus;
    }


    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityPopulation=" + cityPopulation +
                ", cityStatus='" + cityStatus + '\'' +
                '}';
    }
}
