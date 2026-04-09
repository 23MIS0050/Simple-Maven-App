package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    void testAdd() {
        assertEquals(5, app.add(2, 3));
    }

    @Test
    void testEvenOdd() {
        assertEquals("Even", app.evenOdd(4));
    }

    @Test
    void testMultiply() {
        assertEquals(6, app.multiply(2, 3));
    }

    @Test
    void testFactorial() {
        assertEquals(120, app.factorial(5));
    }

    @Test
    void testPrime() {
        assertTrue(app.isPrime(7));
    }
}