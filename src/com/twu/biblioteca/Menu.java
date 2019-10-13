package com.twu.biblioteca;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;


public class Menu {

    public static String librarianOptions =
            "[B] List of Books\n" + "[M] List of Movies\n" + "[C] Check Out\n" + "[R] Return\n" + "[P] View Profile\n" + "[O] Log Out\n";

    public static String guestOptions =
            "[B] List of Books\n" + "[M] List of Movies\n" + "[Q] Quit";

    // show main menu options
    public static void displayGuestOptions() {
        System.out.println(guestOptions);

    }

    public static void displayLibrarianOptions() {
        System.out.println(librarianOptions);

    }


    public static void runMenu(Library library, UserManager userManager) {

        //ArrayList bookList = library.getAvailableBooks();
        Map<String, Book> bookList = library.getAvailableBooks();
        Map<String, Movie> movieList = library.getAvailableMovies();
        ArrayList <User> librarianList = userManager.userList;

        String userInput1;
        String userInput2;
        String selection1;
        String selection2;
        String passWord;

        String credentials;

        boolean bool = true;

        while(bool) {
            if(!userManager.isLoggedIn()) {
//              displayGuestOptions();
                userInput1 = UserInput.userSelection("\nPlease login using your Library Number:");
                if (userInput1.contains("111-1111")) {
                    passWord = UserInput.userSelection("Please enter password");
                    userManager.authenticate(userInput1, passWord);
                    displayLibrarianOptions();

                    while(bool) {
                    userInput2 = UserInput.userSelection("\nPlease choose an option:");

                     if (!userInput2.contains("B")) {
                        if (userInput2.contains("Q")) {
                            bool = false;
                            System.out.println("Bye. Come again!");
                        } else if (userInput2.contains("C")) {
                            selection1 = UserInput.userSelection("What would you like to check out? Book or Movie?");
                            selection2 = UserInput.userSelection("Name the " + selection1 + " you want to check out");
                            library.checkOutItem(movieList, bookList, selection1, selection2);
                        } else if (userInput2.contains("R")) {
                            selection1 = UserInput.userSelection("Which item are you returning? Book or Movie?");
                            selection2 = UserInput.userSelection("Name the " + selection1 + " you want to return");
                            library.returnItem(movieList, bookList, selection1, selection2);
                        } else if (userInput2.contains("M")) {
                            Set<String> movies = movieList.keySet(); //returns a set having the keys of hash map

                            movies.forEach(item -> {
                                        Movie movie = movieList.get(item); //retrieving the value of key which is the movie object
                                        System.out.println(movie.getTitle() + " | " + movie.getYear() + " | " + movie.getDirector() + " | " + movie.getRating());
                            });
                        } else if(userInput2.contains("P")){
                            for(User librarian : librarianList){
                                System.out.println("Name: " + librarian.getName() + "\n" + "Email: " +  librarian.getEmail() + "\n" +  "Phone Number: " + librarian.getPhoneNumber());
                            }
                        } else{
                            System.out.println("Invalid option");
                        }
                    } else { //if selection is "B"
                        Set<String> books = bookList.keySet(); //returns a set having the keys of hash map

                        books.forEach(item -> {
                                    Book book = bookList.get(item); //retrieving the value of key which is the book object
                                    System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getPublicationYear());

                        });
                      }
                    }

                } else {
                    System.out.println("Invalid Library Number. Please try again.");
                }
            }
        }
    }
};


            //if (userManager.isCurrentUser())
                //System.out.println(guestOptions);
//            if(userManager.authenticate(String credentials)){
//                credentials = UserInput.userSelection("\nPlease choose an option:");
//                System.out.println(librarianOptions);
//            } else {
//                System.out.println(guestOptions);
//                input = UserInput.userSelection("\nLibrarian Number:");
//                UserManager.authenticate(input);
//       }


//       while(bool){
//            input = UserInput.userSelection("\nPlease choose an option:");
//
//            if (!input.contains("B")) {
//                if (input.contains("Q")) {
//                    bool = false;
//                    System.out.println("Bye. Come again!");
//                }else if(input.contains("C")) {
//                    selection1 = UserInput.userSelection("What would you like to check out? Book or Movie?");
//                    selection2 = UserInput.userSelection("Name the " + selection1 + " you want to check out");
//                    library.checkOutItem(movieList, bookList, selection1, selection2);
//                }else if(input.contains("R")){
//                    selection1 = UserInput.userSelection("Which item are you returning? Book or Movie?");
//                    selection2 = UserInput.userSelection("Name the " + selection1 + " you want to return");
//                    library.returnItem(movieList, bookList, selection1, selection2);
//                }else if(input.contains("M")){
//                    Set<String> movies = movieList.keySet(); //returns a set having the keys of hash map
//
//                    movies.forEach(item -> {
//                        Movie movie = movieList.get(item); //retrieving the value of key which is the movie object
//                        System.out.println(movie.getTitle() + " | " + movie.getYear() + " | " + movie.getDirector() + " | " + movie.getRating());
//                    }
//                    );
//
//                }else {
//                    System.out.println("Invalid option");
//                }
//            }else{ //if selection is "B"
//                Set<String> books = bookList.keySet(); //returns a set having the keys of hash map
//
//                books.forEach(item ->{
//                     Book book = bookList.get(item); //retrieving the value of key which is the book object
//                     System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getPublicationYear());
//                }
//                );
//            }
//        }
 //   }

//                for (int i = 0; i < books.size(); i++) {
//                    //Book item = (Book) bookList.get(i);
//                    Book item = bookList.get(books.get(i));