package com.twu.biblioteca.presentation;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserInterfaceTest {

    @Test
    public void testBuildWelcomeMessage() {
        assertEquals("Welcome to 'Biblioteca' Library Management System!", UserInterface.buildWelcomeMessage());
    }
}