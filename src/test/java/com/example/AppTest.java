package com.example;

import static org.junit.Assert.*;
import org.junit.Test;
public class AppTest {

    @Test
    public void testAddition() {

        assertEquals(8, App.add(5,3));

    }

    @Test
    public void testSubtraction() {

        assertEquals(2, App.subtract(5,3));

    }
}
