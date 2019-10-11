package com.twu.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class WelcomeMsgTest {

    private WelcomeMsg message;

    @Test
    public void shouldDisplayWelcomeMsg() {

        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        PrintStream newPrintStream = new PrintStream(testOutput);

        PrintStream originalPrintStream = System.out;
        System.setOut(newPrintStream);

        message = new WelcomeMsg();
        message.displayWelcomeMsg();

        assertEquals("Welcome to Biblioteca! You're one stop shop for great book titles in Bangalore!\n", testOutput.toString());

        System.setOut(originalPrintStream);
    }
}

