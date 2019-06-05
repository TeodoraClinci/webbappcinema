package com.entities;

import java.text.DateFormat;
import java.util.Date;

public class Movie {


    private int id;
    private String name;
    private String duration;
    private String genre;
    private String imagePath;
    private String date;
    private String hour;

    public Movie(){

    }

    public Movie(String name, String duration, String genre, String imagePath, String date, String hour) {
        this.name = name;
        this.duration = duration;
        this.genre = genre;
        this.imagePath = imagePath;
        this.date = date;
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {

        return hour;
    }





    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }


    public String getDetails(){
        return genre+" "+duration+"min";
    }

    public Movie[] generateMovies(){

        Movie[] movieArray = new Movie[10];

        for(int i = 0; i < movieArray.length; i++){
            movieArray[i] = new Movie("Beauty and The Beast","135", "Animated/Drama","/assets/images/film1.jpg","12/05/2019","13:30");
        }

        return movieArray;

    }




}
