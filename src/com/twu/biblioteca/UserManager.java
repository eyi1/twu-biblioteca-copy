package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {

    private static final String LOGIN_MSG = "Successfully logged in";
    private static final String LOGGED_IN_MSG = "Already logged in";
    private static final String LOG_OUT_MSG = "Successfully logged out";
    private static final String PASSWORD_MSG = "Enter Password";
    private static final String LIBRARIAN_NUMBER_MSG = "Enter Library Number";

    // private Map<String, User> userList;
    private User currentUser;
    private ArrayList<User> userList;

    public UserManager(){
        this.userList = new ArrayList<User>();
        this.userList.add(new User("EJ","eunxjeong@aim.com", "000-000-0000","111-1111", "12345"));
    }

    public User getCurrentUser(){
        return currentUser;
    }

    public boolean isLoggedIn(){
        return currentUser != null;
    };

    public void authenticate(String input, String pw){
        if(isLoggedIn()){
            System.out.println(LOGGED_IN_MSG);
        }
        currentUser = retrieveUser(input, pw );
        if(!isLoggedIn()){
            System.out.println(PASSWORD_MSG);
        }else{
            System.out.println(LOGIN_MSG);
            }
        }

    private User retrieveUser(String libraryNumber, String password) {
        for(User u : userList){
            if(isUserVerified(u, libraryNumber, password)) return u;
        }
        return null;
    }

    private boolean isUserVerified(User user, String libraryNumber, String password){
        return user.getLibrarianNumber().equals(libraryNumber) && user.getPassword().equals(password);
    }
}
