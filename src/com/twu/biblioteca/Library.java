package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;

public class Library {

    //private ArrayList<Book> availableBooks;
    private Map<String, Book> availableBooks;
    private Map<String, Book> checkedOutBooks;

    public Library(){
        //availableBooks = new ArrayList<Book>();

        availableBooks = new HashMap<String, Book>();

       // availableBooks.put("Kafka on the Shore", new Book("Kafka on the Shore", "Haruki Murakami", 2012));
        availableBooks.put("Becoming", new Book("Becoming", "Michelle Obama", 2016));
        availableBooks.put("The Educated: Memoir", new Book("The Educated: Memoir", "Tara Westover", 2013));
        availableBooks.put("Kafka on the Shore", new Book("Kafka on the Shore", "Haruki Murakami", 2012));

        checkedOutBooks = new HashMap<String, Book>();

        checkedOutBooks.put("Curious George", new Book("Curious George", "George George", 1990));

    }

    public Map<String, Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }

    public Map<String,Book> getAvailableBooks() {
        return availableBooks;
    }


    public boolean checkOutBook(String input){
           Book book = getAvailableBooks().get(input);

           if(book != null){
               availableBooks.remove(book);
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
