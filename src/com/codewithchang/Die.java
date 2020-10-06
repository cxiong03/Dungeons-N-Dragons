package com.codewithchang;

import java.util.Random;

public class Die {
    private int value;
    private int numberOfSides;

    public Die() {
        value = 1;
    }

    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        value = 1;
    }

    public Die(int numberOfSides, int value) {
        this.numberOfSides = numberOfSides;
        this.value = value;
    }

    public void roll(Random rand) {
        value = rand.nextInt(numberOfSides) + 1;
    }

    public int getValue() {
        return value;
    }
}
