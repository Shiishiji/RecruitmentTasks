package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class FrogsTest {

    Frogs frogs;

    @BeforeEach
    void setUp() {
        frogs = new Frogs();
    }

    @Test
    void firstCase() {
        int [] blocks = { 2, 6, 8, 5 };
        int result = frogs.solution(blocks);
        assertEquals(3, result);
    }

    @Test
    void secondCase() {
        int [] blocks = { 1, 3, 3, 2, 6 };
        int result = frogs.solution(blocks);
        assertEquals(4, result);
    }

    @Test
    void thirdCase() {
        int [] blocks = { 1, 1 };
        int result = frogs.solution(blocks);
        assertEquals(2, result);
    }

}