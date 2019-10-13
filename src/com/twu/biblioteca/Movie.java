package com.twu.biblioteca;

public class Movie {

    private String title;
    private int year;
    private String director;
    private int rating;

    public Movie(String title, int year, String director, int rating){
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }
}