package com.example.tdd.domain;

import java.util.List;

public class Cars {

    private List<Car> cars;

    private Cars() {
    }

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

}
