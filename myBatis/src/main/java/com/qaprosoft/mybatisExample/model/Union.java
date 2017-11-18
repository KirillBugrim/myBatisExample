package com.qaprosoft.mybatisExample.model;


public class Union {

    private long id;
    private String name;

    public Union(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Union(String name) {
        this.name = name;
    }

    public Union() {
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

    @Override
    public String toString() {
        return "Union{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
