package com.example.tdd;

import java.util.Random;

public class CarService {
    private static final int RANDOM_MAX_VALUE =10;
    private static final int MIN_NUMBER =4;

    private static Random random = new Random();


    public static boolean moveCount() {
        return random.nextInt(RANDOM_MAX_VALUE) >= MIN_NUMBER;
    }

}
