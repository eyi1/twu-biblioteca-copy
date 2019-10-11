package com.twu.biblioteca;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void shouldDisplayMainMenu() {

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(testOutput);
        PrintStream originalStream = System.out;

        System.setOut(newPrintStream);

        Menu menu = new Menu();
        menu.displayMainMenu();

        assertEquals( "[B] Books\n" + "[R] Return\n" + "[C] Check Out\n" + "[M] Movies\n" + "[Q] Quit\n", testOutput.toString());

        //System.setOut(originalStream);

    }

    @Test
    public void runMenu() {
    }
}