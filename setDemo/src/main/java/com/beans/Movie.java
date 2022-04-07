package com.beans;

public class Movie {
    private  int id;
    private String  name;

    public Movie(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
