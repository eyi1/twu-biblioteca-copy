package com.twu.biblioteca;

public class User {
    private String name;
    private String email;
    private String number;
    private String librarianNumber;
    private String password;

    public User(String name, String email, String number, String librarianNumber, String password){
        this.name = name;
        this.email = email;
        this.number = number;
        this.librarianNumber = librarianNumber;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String getLibrarianNumber() {
        return librarianNumber;
    }

    public String getPassword() {
        return password;
    }
}