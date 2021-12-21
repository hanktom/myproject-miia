package com.tom;

import java.util.Random;

public class GuessGame {
    Random random = new Random();
    int secret = random.nextInt(10)+1;
    boolean end = false;

    public int guess(int n) {
        return n - secret;
    }

    public boolean bigger(int n) {
        if (n==secret) {
            end = true;
        }
        if (n > secret) {
            return true;
        } else {
            return false;
        }
    }

    public boolean smaller(int n) {
        if (n==secret) {
            end = true;
        }
        return n<secret;
    }

}
