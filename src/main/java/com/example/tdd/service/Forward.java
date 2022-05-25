package com.example.tdd.service;

import java.util.Random;

public class Forward implements MovableStrategy {
    private static final int RANDOM_MAX_VALUE =10;
    private static final int MIN_NUMBER =4;
    private static Random random = new Random();
    @Override
    public boolean isCarMoving() {
        return random.nextInt(RANDOM_MAX_VALUE) >= MIN_NUMBER;
    }
}
