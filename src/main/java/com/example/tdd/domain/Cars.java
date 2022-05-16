package com.example.tdd.domain;

import com.example.tdd.service.Forward;
import com.example.tdd.service.MovableStrategy;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static List<Car> cars  = new ArrayList<>();

    private Cars() {
    }

    public static List<Car> createCarList(String carsName) {
        //split 예외처리 추가하기
        String[] names = carsName.split(",");

        for (int i = 0; i < names.length; i++) {
            cars.add(new Car(names[i]));
        }
        return cars;
    }


}
