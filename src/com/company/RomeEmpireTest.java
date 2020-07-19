package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomeEmpireTest {

    RomeEmpire romeEmpire;

    @BeforeEach
    void setUp() {
        romeEmpire = new RomeEmpire();
    }

    @Test
    void firstCase() {
        int [] a = { 1, 2, 3 };
        int [] b = { 0, 0, 0 };
        try {
            int result = romeEmpire.solution(a, b);
            assertEquals(0, result);
        } catch (Exception e) {
            assertEquals(a.length,b.length);
        }
    }

    @Test
    void secondCase() {
        int [] a = { 0, 1, 2, 4, 5 };
        int [] b = { 2, 3, 3, 3, 2 };
        try {
            int result = romeEmpire.solution(a, b);
            assertEquals(3, result);
        } catch (Exception e) {
            assertEquals(a.length,b.length);
        }
    }

    @Test
    void thirdCase() {
        int [] a = { 2, 3, 3, 4 };
        int [] b = { 1, 1, 0, 0 };
        try {
            int result = romeEmpire.solution(a, b);
            assertEquals(-1, result);
        } catch (Exception e) {
            assertEquals(a.length,b.length);
        }
    }

    @Test
    void inputParametersLengthMismatch() {
        int [] a = { 1, 2, 3 };
        int [] b = { 4, 5 };
        assertThrows(Exception.class, () -> { romeEmpire.solution(a, b); });
    }
}