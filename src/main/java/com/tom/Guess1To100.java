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

    }
}
