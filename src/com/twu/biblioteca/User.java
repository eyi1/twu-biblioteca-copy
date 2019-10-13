package com.twu.biblioteca;

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private String librarianNumber;
    private String password;

    public User(String name, String email, String phoneNumber, String librarianNumber, String password){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.librarianNumber = librarianNumber;
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLibrarianNumber() {
        return librarianNumber;
    }

    public String getPassword() {
        return password;
    }
}