package com.beans;

import java.util.Set;

public class Director {
    private  int id;
    private  String name ;
    private Set<Movie> movies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> movies) {
        this.movies = movies;
    }
    public void display(){

        System.out.println("director id "+id);
        System.out.println("director name "+name);
        Set<Movie> s = getMovies();
        System.out.println("Movies are");
        for (Movie m : s
             ) {
            System.out.println(m);
        }
    }
}
