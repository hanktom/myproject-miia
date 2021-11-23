package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(100)+1;
        System.out.println(secret);
        int min = 1;
        int max = 100;
        boolean win = false;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter number between " + min + " to " + max );
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num > secret) {
                max = num;
            } else if (num < secret) {
                min = num;
            } else {
                win = true;
                break;
            }
        }
        if (win) {
            System.out.println("You win");
        } else {
            System.out.println("You loose");
        }
    }
}
