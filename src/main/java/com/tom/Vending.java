package com.tom;

import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean end = false;
        while(!end) {
            System.out.println("Please put your coin(1/5/10):  Total:" + total);
            String s = scanner.next();
            int num = Integer.parseInt(s);
            switch (num) {
                case 1:
                    System.out.println("1");
                    total = total + num;
                    break;
                case 5:
                    total = total + num;
                    break;
                case 10:
                    total = total + num;
                    break;
                case 0:
                    end = true;
                    break;
                default:
                    break;
            }
        }
        System.out.println("END");
    }
}
