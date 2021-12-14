package com.tom;

public class DiceCounter {
    public static void main(String[] args) {
        int[] counters = new int[6];
        Dice dice = new Dice();

        for (int i = 0; i < 10; i++) {
            int n = dice.roll();
            System.out.println(n);
            counters[n-1]++;
        }
        int max = 0;
        int point = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1) + " " + counters[i] + " times");
            if (counters[i] > max) {
                max = counters[i];
                point = i+1;
            }
        }
        //System.out.println(point + " " + max + " times");
    }
}
