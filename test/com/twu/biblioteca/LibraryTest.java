package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library = new Library();

    @Test
    public void shouldDisplayAllAvailableBooks() {
        Map<String, Book> result = library.getAvailableBooks();
        StringBuilder string = new StringBuilder();

        for(int i = 0; i<result.size(); i++){
                Book book = result.get(i);
                string.append(book.getTitle() + " | " + book.getAuthor() + " | " + book.getPublicationYear() + "\n");
        };

        assertEquals("Kafka on the Shore | Haruki Murakami | 2012\n" +
                "Becoming | Michelle Obama | 2016\n" +
                "The Educated: Memoir | Tara Westover | 2013\n" +
                "Kafka on the Shore | Haruki Murakami | 2012\n", string.toString());

    }
}