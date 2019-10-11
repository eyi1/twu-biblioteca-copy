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

        Library library = new Library();
        Menu.runMenu(library);
    }
}