package com.qaprosoft.mybatisExample.model;

public class City {

    private long id;
    private String name;
    private long cityPopulation;
    private String cityStatus;

    public City() {
    }

    public City(String name, long cityPopulation, String cityStatus) {
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

    public String getCityStatus() {
        return cityStatus;
    }

    public void setCityStatus(String cityStatus) {
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
