package com.sabitalizade.models;

public class DVD extends LibraryItem {
    private int duration;
    private String director;

    public DVD(int id, String title, int duration, String director) {
        super(id, title);
        this.duration = duration;
        this.director = director;
    }
}
