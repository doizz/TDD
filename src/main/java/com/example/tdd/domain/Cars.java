package com.example.tdd.domain;


import java.util.ArrayList;
import java.util.List;

public class Cars {
    private static List<Car> cars = new ArrayList<>();

    public Cars(List<Car> cars) {
        this.cars = cars;
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
