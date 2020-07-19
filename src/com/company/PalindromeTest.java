package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    void setUp() {
        palindrome = new Palindrome();
    }

    @Test
    void shouldReturnAbba() {
        String result = palindrome.solution(4,2);
        assertEquals("abba", result);
    }

    @Test
    void shouldReturnAbbba() {
        String result = palindrome.solution(5,2);
        assertEquals("abbba", result);
    }

    @Test
    void shouldReturnAbbbba() {
        String result = palindrome.solution(6, 2);
        assertEquals("abbbba", result);
    }

    @Test
    void shouldReturnAbccba() {
        String result = palindrome.solution(6, 3);
        assertEquals("abccba", result);
    }

    @Test
    void shouldReturnAbcdcba() {
        String result = palindrome.solution(7, 4);
        assertEquals("abcdcba", result);
    }
}