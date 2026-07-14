package com.sabitalizade;

public class DVD extends LibraryItem {
    private int duration;
    private String director;

    public DVD(int id, String title, int duration, String director) {
        super(id, title);
        this.duration = duration;
        this.director = director;
    }

    @Override
    public void displayDetailedInformation() {
        System.out.println("DVD Information");
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Director: " + director);

    }
}
