package com.tom;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        int aPrice = 15;
        int bPrice = 25;
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        while(!end) {
            System.out.println("Please put your coin(1/5/10):  Total:" + total);
            String s = scanner.next();
            try {
                int num = Integer.parseInt(s);
                switch (num) {
                    case 1:
                    case 5:
                    case 10:
                        total = total + num;
                        break;
                    case 0:
                        end = true;
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("ah");
                if (s.equals("a")) {
                    System.out.println("A drink");
                    if (total >= aPrice) {
                        total = total - aPrice;
                        System.out.println("DON!");
                    } else {
                        System.out.println("BEEP!");
                    }
                }
            }

        }
        System.out.println("END");
    }
}
