package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Library {

    //private ArrayList<Book> availableBooks;
    private Map<String, Book> availableBooks;
    private Map<String, Book> checkedOutBooks;
    private Map<String, Movie> availableMovies;
    private Map<String, Movie> checkedOutMovies;

    public Library(){
        //availableBooks = new ArrayList<Book>();

        //availableBooks:
        availableBooks = new HashMap<String, Book>();

        availableBooks.put("Becoming", new Book("Becoming", "Michelle Obama", 2016));
        availableBooks.put("Green Eggs and Ham", new Book("Green Eggs and Ham", "Dr. Seuss", 1960));
        availableBooks.put("Kafka on the Shore", new Book("Kafka on the Shore", "Haruki Murakami", 2012));

        //checkedOutBooks:
        checkedOutBooks = new HashMap<String, Book>();

        checkedOutBooks.put("Curious George", new Book("Curious George", "Margret Rey", 1941));
        checkedOutBooks.put("My Brilliant Friend", new Book("My Brilliant Friend", "Elena Ferrante", 2011));

        //availableMovies:
        availableMovies.put("Inception", new Movie("Inception", 2009, "Christopher Nolan", 10));
        availableMovies.put("Joker", new Movie("Joker", 2019, "Todd Phillips", 7));
        availableMovies.put("Infinity War", new Movie("Infinity War", 2018, "Anthony Russo", 10));
        availableMovies.put("Green Lantern", new Movie("Green Lantern", 2011, "Martin Campbell", 5));

        //checkedOutMovies;
        checkedOutMovies.put("Dr. Strange", new Movie("Dr. Strange", 2017, "Christopher Nolan", 9));
        checkedOutMovies.put("Spider-man", new Movie("Spider-man", 2019, "Todd Phillips", 8));
    }

    public Map<String, Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public Map<String, Book> getAvailableBooks() {
        return availableBooks;
    }


    public boolean checkOutBook(String input){
           Book book = getAvailableBooks().get(input); //retrieves the value of input - key (string)

           if(book != null){
               availableBooks.remove(input);
               checkedOutBooks.put(input, book);
               System.out.println("Enjoy the book!");
               return true;
           }else{
               System.out.println("Better luck next time!");
               return false;
           }
    }

    public boolean returnBook(String input){
        Book book = getCheckedOutBooks().get(input);

        if(book != null){
            availableBooks.put(input, book);
            System.out.println("Thanks for returning the book");
            return true;
        }else{
            System.out.println("N/A");
            return false;
        }

    };

}
