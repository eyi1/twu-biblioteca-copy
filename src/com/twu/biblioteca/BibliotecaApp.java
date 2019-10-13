package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.start();

    }

    public void start(){
        WelcomeMsg message = new WelcomeMsg();
        message.displayWelcomeMsg();

        UserManager userManager = new UserManager();
        Library library = new Library();
        Menu.runMenu(library, userManager);
    }
}