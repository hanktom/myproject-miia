package com.tom.aaa;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Dice dice = new Dice();
            dice.roll();
            System.out.println(dice.point);
        }
    }
}
