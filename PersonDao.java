package com.dao;

import com.entities.Person;

import java.sql.SQLException;
import java.util.List;

public interface PersonDao {

    void createPersonTable() throws SQLException;

    void insert(Person person) throws SQLException;

    Person selectByid(int id) throws SQLException;

    List<Person> selectall();

    void delete(int id);

    void update(Person person, int id);

    Person selectbyusername(String username);


}