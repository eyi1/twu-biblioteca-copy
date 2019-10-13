package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Library {

    //private ArrayList<Book> availableBooks;
    private Map<String, Book> availableBooks;
    private Map<String, Book> checkedOutBooks;
    private Map<String, Movie> availableMovies;
    private Map<String, Movie> checkedOutMovies;

    public Library() {
//        availableBooks = new ArrayList<Book>();

        //availableBooks:
        this.availableBooks = new HashMap<String, Book>();
        this.availableBooks.put("Becoming", new Book("Becoming", "Michelle Obama", 2016));
        this.availableBooks.put("Green Eggs and Ham", new Book("Green Eggs and Ham", "Dr. Seuss", 1960));
        this.availableBooks.put("Kafka on the Shore", new Book("Kafka on the Shore", "Haruki Murakami", 2012));

        //checkedOutBooks:
        this.checkedOutBooks = new HashMap<String, Book>();
        this.checkedOutBooks.put("Curious George", new Book("Curious George", "Margret Rey", 1941));
        this.checkedOutBooks.put("My Brilliant Friend", new Book("My Brilliant Friend", "Elena Ferrante", 2011));

        //availableMovies:
        this.availableMovies = new HashMap<String, Movie>();
        this.availableMovies.put("Inception", new Movie("Inception", 2009, "Christopher Nolan", 10));
        this.availableMovies.put("Joker", new Movie("Joker", 2019, "Todd Phillips", 7));
        this.availableMovies.put("Infinity War", new Movie("Infinity War", 2018, "Anthony Russo", 10));
        this.availableMovies.put("Green Lantern", new Movie("Green Lantern", 2011, "Martin Campbell", 5));

        //checkedOutMovies;
        this.checkedOutMovies = new HashMap<String, Movie>();
        this.checkedOutMovies.put("Dr. Strange", new Movie("Dr. Strange", 2017, "Christopher Nolan", 9));
        this.checkedOutMovies.put("Spider-man", new Movie("Spider-man", 2019, "Todd Phillips", 8));
    }


    public Map<String, Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public Map<String, Book> getAvailableBooks() {
        return this.availableBooks;
    }

    public Map<String, Movie> getAvailableMovies() {
        return availableMovies;
    }

    public Map<String, Movie> getCheckedOutMovies() {
        return checkedOutMovies;
    }

    public boolean checkOutItem(Map<String, Movie> movie, Map<String, Book> book, String selection1, String selection2) { //here
        Book listOfBooks = getAvailableBooks().get(selection2);
        Movie listOfMovies = getAvailableMovies().get(selection2);

            if (selection1.contains("Movie")) {
                availableMovies.remove(selection2);
                checkedOutMovies.put(selection2, listOfMovies);
                System.out.println("Enjoy the movie!");
                return true;
            } else if (selection1.contains("Book")) {
                availableBooks.remove(selection2);
                checkedOutBooks.put(selection2, listOfBooks);
                System.out.println("Enjoy the book!");
                return true;
            } else {
                System.out.println("Better luck next time!");
                return false;
            }
    };

    public boolean returnItem(Map<String, Movie> movie, Map<String, Book> book, String selection1, String selection2){
        Book bookItem = getCheckedOutBooks().get(selection2);
        Movie movieItem = getCheckedOutMovies().get(selection2);

        if(selection1.contains("Book")){
            availableBooks.put(selection2, bookItem);
            System.out.println("Thanks for returning the book");
            return true;
        }else if(selection1.contains("Movie")){
            availableMovies.put(selection2, movieItem);
            System.out.println("Thanks for returning the movie");
            return true;
        }else{
            System.out.println("N/A");
            return false;
        }

    };
}

//        if(bookItem != null){
//            availableBooks.put(selection2, bookItem);
//            System.out.println("Thanks for returning the book");
//            return true;
//        }else{
//            System.out.println("N/A");
//            return false;
//        }


//    public boolean checkOutBook(String input){
//           Book book = getAvailableBooks().get(input); //retrieves the value of input - key (string)
//
//           if(book != null){
//               availableBooks.remove(input);
//               checkedOutBooks.put(input, book);
//               System.out.println("Enjoy the book!");
//               return true;
//           }else{
//               System.out.println("Better luck next time!");
//               return false;
//           }
//    }
//


//    public boolean returnBook(String input){
//        Book book = getCheckedOutBooks().get(input);
//
//        if(book != null){
//            availableBooks.put(input, book);
//            System.out.println("Thanks for returning the book");
//            return true;
//        }else{
//            System.out.println("N/A");
//            return false;
//        }
//
//     };

