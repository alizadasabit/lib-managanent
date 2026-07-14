package com.sabitalizade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Book book = new Book(1, "Java Programming", "John Smith", 450);
        Journal journal = new Journal(2, "Science Today", "Nature");
        DVD dvd = new DVD(3, "Inception", 148, "Christopher Nolan");

        LibraryService service = new LibraryService();

        service.borrowItem(book);
        service.returnItem(book);
        service.displayItem(book);
        book.displayDetailedInformation();

        System.out.println();

        service.borrowItem(journal);
        service.returnItem(journal);
        service.displayItem(journal);
        journal.displayDetailedInformation();


        System.out.println();

        service.borrowItem(dvd);
        service.returnItem(dvd);
        service.displayItem(dvd);
        dvd.displayDetailedInformation();

    }

}