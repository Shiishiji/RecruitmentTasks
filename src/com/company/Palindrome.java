package com.company;

public class Palindrome {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public String solution(int N, int K) {
        String palindrome = "";
        for (int i=0, j=0; i<(N/2)-1; i++) {
            if (i <= K)
                j = i;

            palindrome += alphabet[j];
        }

        if (N%2==1)
            palindrome += this.alphabet[K-1];

        palindrome += (new StringBuilder(palindrome).reverse().toString());
        return palindrome;
    }
}
