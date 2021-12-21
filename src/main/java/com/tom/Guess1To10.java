package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess1To10 {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int counter = 0;
        while (!game.end) {
            System.out.println("Please enter number(1-10):");
            String s = scanner.next();
            n = Integer.parseInt(s);
            int diff = game.guess(n);
            if ( diff > 0) {
                System.out.println("Smaller");
            } else if (diff < 0) {
                System.out.println("Bigger");
            } else {
                System.out.println("You got it");
            }
            counter++;
        }
    }
}
