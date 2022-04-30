package com.example.tdd.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static List<Car> cars  = new ArrayList<>();

    private Cars() {
    }

    public static List<Car> createCarList(int carCount) {
        for (int i = 0; i < carCount; i++) {
            cars.add(new Car());
        }
        return cars;
    }

}
