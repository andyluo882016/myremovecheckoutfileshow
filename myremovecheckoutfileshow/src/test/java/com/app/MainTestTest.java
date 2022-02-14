package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTestTest {
    MainTest test = new MainTest();
    @Test
    void add() {
        assertEquals(8, test.add(2, 6));
        assertNotNull(test.add(10,90));
    }
}