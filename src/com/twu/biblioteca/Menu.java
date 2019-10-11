package com.twu.biblioteca;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Menu {


    public static String options =
            "[B] Books\n" + "[R] Return\n" + "[C] Check Out\n" + "[M] Movies\n" + "[Q] Quit\n";


    //show main menu options
    public static void showMainMenu(){
        System.out.println(options);
    }

    public static void runMenu(Library library) {

        showMainMenu();
        //ArrayList bookList = library.getAvailableBooks();
        Map<String, Book> bookList = library.getAvailableBooks();
        //System.out.println(selection.contains("B"));
        String selection;

        boolean bool = true;

        while(bool) {
            selection = UserInput.userSelection("Please choose an option");

            if (!selection.contains("B")) {
                if (selection.contains("Q")) {
                    bool = false;
                    System.out.println("bye");
                }else if(selection.contains("C")) {
                    String checkOutInput = UserInput.userSelection("What book would you like to check out?");
                    library.checkOutBook(checkOutInput);
                }else if(selection.contains("R")){
                    String checkOutInput = UserInput.userSelection("Which book are you returning?");
                    library.returnBook(checkOutInput);
                }else{
                    System.out.println("Invalid option");
                }
            } else {
                Set<String> books = bookList.keySet();

                books.forEach(item ->{
                     Book book = bookList.get(item);
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