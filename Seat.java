package com.entities;

public class Seat {

    private int id;
    private String row;
    private int number;
    private int movie_id;

    public Seat(){

    }

    public Seat(String row, int number, int movie_id) {
        this.row = row;
        this.number = number;
        this.movie_id = movie_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public int getId() {
        return id;
    }

    public String getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }
}
