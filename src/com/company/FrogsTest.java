package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FrogsTest {

    @Test
    void firstCase() {
        Frogs frogs = new Frogs();
        int [] blocks = { 2, 6, 8, 5 };
        int result = frogs.solution(blocks);
        assertEquals(3, result);
    }

    @Test
    void secondCase() {
        Frogs frogs = new Frogs();
        int [] blocks = { 1, 3, 3, 2, 6 };
        int result = frogs.solution(blocks);
        assertEquals(4, result);
    }

    @Test
    void thirdCase() {
        Frogs frogs = new Frogs();
        int [] blocks = { 1, 1 };
        int result = frogs.solution(blocks);
        assertEquals(2, result);
    }

}