package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class PalindromeTest {

    @Test
    void shouldReturnAbba() {
        Palindrome palindrome = new Palindrome();
        String result = palindrome.solution(4,2);
        Assert.assertEquals("abba", result);
    }

    @Test
    void shouldReturnAbbba() {
        Palindrome palindrome = new Palindrome();
        String result = palindrome.solution(5,2);
        Assert.assertEquals("abbba", result);
    }

    @Test
    void shouldReturnAbbbba() {
        Palindrome palindrome = new Palindrome();
        String result = palindrome.solution(6, 2);
        Assert.assertEquals("abbbba", result);
    }

    @Test
    void shouldReturnAbccba() {
        Palindrome palindrome = new Palindrome();
        String result = palindrome.solution(6, 3);
        Assert.assertEquals("abccba", result);
    }

    @Test
    void shouldReturnAbcdcba() {
        Palindrome palindrome = new Palindrome();
        String result = palindrome.solution(7, 4);
        Assert.assertEquals("abcdcba", result);
    }
}