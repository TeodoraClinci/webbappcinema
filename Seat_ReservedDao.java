package com.dao;

import com.entities.Seat_Reserved;

import java.util.List;

public interface Seat_ReservedDao {

    void createSeat_ReservedTable();

    void insert(Seat_Reserved seat_reserved);

    Seat_Reserved selectById(int id);

    List<Seat_Reserved> selectall();

    void delete(int id);

}
