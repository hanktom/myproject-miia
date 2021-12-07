package com.tom;

public class Poker {
    public static void main(String[] args) {
        char[] types = {'c', 'd', 'h', 's'};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1) + ""+ types[i] + " ");
            }
            System.out.println();
        }
    }
}
