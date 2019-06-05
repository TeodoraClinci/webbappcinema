package com.dao;

import com.entities.Seat;

import java.util.List;

public interface SeatDao {

    void createSeatTable();

    void insert(Seat seat);

    Seat selectById(int id);

    List<Seat> selectall();

    void delete(int id);
}
