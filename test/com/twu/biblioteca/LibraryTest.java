
package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library = new Library();

    @Test
    public void shouldDisplayAllAvailableBooks() {
        Map <String, Book> result = library.getAvailableBooks();
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println(result);

        result.forEach((key, book) -> {
            stringBuilder.append(book.toString()).append("\n");
            System.out.println(stringBuilder);
        });

        assertEquals(
                "Becoming | Michelle Obama | 2016\n" +
                         "Kafka on the Shore | Haruki Murakami | 2012\n" +
                         "Green Eggs and Ham | Dr. Seuss | 1960\n", stringBuilder.toString());

//        System.out.println(result.getClass().getSimpleName());
//        Set<String> bookList = result.keySet(); //returns a set having the keys of hashmap
//        System.out.println(bookList.getClass().getSimpleName());

//        for (String key : result) {
//            Book book = bookList.get(key);
//            string.append(book.getTitle() + " | " + book.getAuthor() + " | " + book.getPublicationYear() + "\n");
//            System.out.println(bookList);
//        }

        //System.out.println(Book book.values());

//        for(int i = 0; i<result.size(); i++){
//                Book book = result.get(i);
//                string.append(book.getTitle() + " | " + book.getAuthor() + " | " + book.getPublicationYear() + "\n");
//        };

    };

}
