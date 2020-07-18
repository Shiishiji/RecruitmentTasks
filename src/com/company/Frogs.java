package com.company;

public class Frogs {

    int savedDistance = 0;
    int [] blocks;

    private int travelLeft(int current) {
        if (current == 0)
            return 0;

        if (isTraversable(current, current - 1)) {
            return travelLeft(current - 1);
        }
        return current;
    }

    private int travelRight(int current) {
        try {
            if (current == blocks.length - 1)
                return blocks.length - 1;

            if (isTraversable(current, current + 1)) {
                return travelRight(current + 1);
            }
            return current;
        } catch (java.lang.NullPointerException e) {
            System.out.println(current);
            System.out.println(blocks.length);
        }
        return current;
    }

    private boolean isTraversable(int start, int destination) {
        return blocks[destination] >= blocks[start];
    }

    private static int calculateDistance(int j, int k) {
        return k - j + 1;
    }

    public int solution(int[] blocks) {
        this.blocks = blocks;
        for (int i=0; i<blocks.length-1; i++) {
            int maxLeft = travelLeft(i);
            int maxRight = travelRight(i);
            int distance = calculateDistance(maxLeft, maxRight);
            if (distance > savedDistance) {
                savedDistance = distance;
            }
        }
        return savedDistance;
    }

}
