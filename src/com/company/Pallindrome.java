package com.company;

public class Pallindrome {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public String solution(int N, int K) {
        String pallindrome = "";
        for (int i=0, j=0; i<(N/2)-1; i++) {
            if (i <= K)
                j = i;

            pallindrome += alphabet[j];
        }

        if (N%2==1)
            pallindrome += this.alphabet[K-1];

        pallindrome += (new StringBuilder(pallindrome).reverse().toString());
        return pallindrome;
    }
}
