package com.entities;

public class Seat_Reserved {

    private int id;
    private int seat_id;
    private int rezervation_id;

    public Seat_Reserved(){

    }

    public Seat_Reserved(int seat_id, int rezervation_id) {
        this.seat_id = seat_id;
        this.rezervation_id = rezervation_id;
    }

    public int getId() {
        return id;
    }

    public int getSeat_id() {
        return seat_id;
    }

    public int getRezervation_id() {
        return rezervation_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public void setRezervation_id(int rezervation_id) {
        this.rezervation_id = rezervation_id;
    }
}
