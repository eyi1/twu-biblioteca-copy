package com.twu.biblioteca;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Menu {


    public static String options =
            "[B] List of Books\n" + "[R] Return\n" + "[C] Check Out\n" + "[M] List of Movies\n" + "[Q] Quit";

    //show main menu options
    public static void displayMainMenu(){
        System.out.println(options);
    }

    public static void runMenu(Library library) {

        displayMainMenu();
        //ArrayList bookList = library.getAvailableBooks();
        Map<String, Book> bookList = library.getAvailableBooks();
        //System.out.println(selection.contains("B"));
        String selection;

        boolean bool = true;

        while(bool) {
            selection = UserInput.userSelection("\nPlease choose an option");

            if (!selection.contains("B")) {
                if (selection.contains("Q")) {
                    bool = false;
                    System.out.println("Bye. Come again!");
                }else if(selection.contains("C")) {
                    selection = UserInput.userSelection("What book would you like to check out?");
                    //String checkOutInput = UserInput.userSelection("What book would you like to check out?");
                    library.checkOutBook(selection);
                }else if(selection.contains("R")){
                    selection = UserInput.userSelection("What book are you returning?");
                    //String returnInput = UserInput.userSelection("What book are you returning?");
                    library.returnBook(selection);
                }else if(selection.contains("M")){
                    selection = UserInput.userSelection("What movie would you like to check out?");


                }else{
                    System.out.println("Invalid option");
                }
            } else { //if selection is "B"
                Set<String> books = bookList.keySet(); //returns a set having the keys of hash map

                books.forEach(item ->{
                     Book book = bookList.get(item); //retrieving the value of key which is the book object
                     System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getPublicationYear());
                }

                );

            }
        }
    }

};


//System.out.println(item.getTitle() + " | " + item.getAuthor() + " | " + item.getPublicationYear()););

//                for (int i = 0; i < books.size(); i++) {
//                    //Book item = (Book) bookList.get(i);
//                    Book item = bookList.get(books.get(i));

// System.out.println(item);