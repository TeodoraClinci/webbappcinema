package com.entities;

public class Reservation {

    private int id;
    private int movie_id;
    private boolean active;
    private String name;

     public Reservation(){

    }

    public Reservation(int movie_id, boolean active, String name) {
        this.movie_id = movie_id;
        this.active = active;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }
}




