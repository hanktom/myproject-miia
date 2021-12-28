package com.tom;

import java.util.Random;

public class Dice {
    int point = 1;

    public Dice() {
        point = new Random().nextInt(6)+1;
    }

    public boolean isMax() {
        if (point == 6) {
            return true;
        } else {
            return false;
        }
    }
}
