package com.dao;

import com.entities.Movie;
import java.util.Date;

import java.util.List;

public interface MovieDao {

    void createMovieTable();

    void insertMovie(Movie movie);

    Movie selectByid(int id);

    List<Movie> selectall();

    void delete(int id);

    Movie selectByName(String name);

    Movie selectByGenre(String genre);

    Movie selectByDate (String date);

    void update(Movie movie, int id);
}
