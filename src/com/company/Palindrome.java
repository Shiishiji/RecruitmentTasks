package com.company;

public class Palindrome {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public String solution(int N, int K) {
        StringBuilder palindrome = new StringBuilder();
        for (int i=0, j=0; i<(N/2); i++) {
            if (i <= K-1)
                j = i;

            palindrome.append(alphabet[j]);
        }

        if (N%2==1) {
            palindrome.append(this.alphabet[K - 1]);
            palindrome.append(new StringBuilder(palindrome.substring(0, palindrome.length() - 1)).reverse().toString());
        } else {
            palindrome.append(new StringBuilder(palindrome).reverse().toString());
        }
        return palindrome.toString();
    }
}
