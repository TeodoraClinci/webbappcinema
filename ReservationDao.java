package com.dao;

import com.entities.Reservation;

import java.util.List;

public interface ReservationDao {

    void createReservationTable();

    void insert(Reservation rezervation);

    Reservation selectById(int id);

    List<Reservation> selectall();

    void delete(int id);

}
