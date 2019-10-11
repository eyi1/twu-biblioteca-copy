package com.twu.biblioteca;

import java.util.*;

public class BibliotecaApp {

    public static void main(String[] args) {

        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.start();

    }

    public void start(){
        WelcomeMsg message = new WelcomeMsg();
        message.displayWelcomeMsg();

        Menu menu = new Menu();
        Library library = new Library();
        menu.runMenu(library);
    }

//        List<Book> availableBooks = new ArrayList<Book>();
//        Book book1 = new Book();
//        book1.setIsbnNumber("1234");
//        book1.setAuthor("Me");
//        book1.setTitle("My first course");
//        availableBooks.add(book1);
//
//        Scanner reader = new Scanner(System.in);
//        System.out.println("Please enter something");
//        String userInput = reader.next();
//        System.out.println(userInput);
//        Map<String, String> userMap = new HashMap<String, String>();
//        userMap.put("1", "user1");
//        userMap.put("2", "user2");
//        String user = userMap.get("2");
//        System.out.println(user);


}
