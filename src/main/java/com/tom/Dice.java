package com.tom;

import java.util.Random;

public class Dice {
    int point = 1;

    public Dice() {
        System.out.println("Hehehehehe");
    }

    public void roll() {
//        System.out.println("rolling");
        Random random = new Random();
        point = random.nextInt(6)+1;
    }

    public boolean isMax() {
        if (point == 6) {
            return true;
        } else {
            return false;
        }
    }
}
