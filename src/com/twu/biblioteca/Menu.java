package com.twu.biblioteca;

import java.util.Map;
import java.util.Set;


public class Menu {


    public static String options =
            "[B] List of Books\n" + "[M] List of Movies\n" + "[C] Check Out\n" + "[R] Return\n" + "[P] View Profile" + "[Q] Quit";

    //show main menu options
    public static void displayMainMenu() {
        System.out.println(options);

    }

    public static void runMenu(Library library) {

        displayMainMenu();
        //ArrayList bookList = library.getAvailableBooks();
        Map<String, Book> bookList = library.getAvailableBooks();
        Map<String, Movie> movieList = library.getAvailableMovies();

        String input;
        String selection1;
        String selection2;
        String anotherInput = null;

        boolean bool = true;

        while(bool) {
            input = UserInput.userSelection("\nPlease choose an option");

            if (!input.contains("B")) {
                if (input.contains("Q")) {
                    bool = false;
                    System.out.println("Bye. Come again!");
                }else if(input.contains("C")) {
                    selection1 = UserInput.userSelection("What would you like to check out? Book or Movie?");
                    selection2 = UserInput.userSelection("Name the " + selection1 + " you want to check out");
                    library.checkOutItem(movieList, bookList, selection1, selection2);
                }else if(input.contains("R")){
                    selection1 = UserInput.userSelection("Which item are you returning? Book or Movie?");
                    selection2 = UserInput.userSelection("Name the " + selection1 + " you want to return");
                    library.returnItem(movieList, bookList, selection1, selection2);
                }else if(input.contains("M")){
                    Set<String> movies = movieList.keySet(); //returns a set having the keys of hash map

                    movies.forEach(item -> {
                        Movie movie = movieList.get(item); //retrieving the value of key which is the movie object
                        System.out.println(movie.getTitle() + " | " + movie.getYear() + " | " + movie.getDirector() + " | " + movie.getRating());
                    }
                    );

                }else {
                    System.out.println("Invalid option");
                }
            }else{ //if selection is "B"
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

//                for (int i = 0; i < books.size(); i++) {
//                    //Book item = (Book) bookList.get(i);
//                    Book item = bookList.get(books.get(i));
