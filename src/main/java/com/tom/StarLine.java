package com.tom;

public class StarLine {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            for (int j = 0; j < 20; j++) {
                if (2*i==19-j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
