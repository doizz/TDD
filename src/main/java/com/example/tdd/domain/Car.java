package com.example.tdd.domain;

import com.example.tdd.common.InputView;
import com.example.tdd.service.RacingEvent;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Distance distance;
    private static List<Car> cars = new ArrayList<>();

    public Car() {
    }

    public static void moveCars() {
        //Car리스트 생성.
        createCarList(InputView.getCarCount());
        //이동하는거리 판단
        RacingEvent.carMove(cars);
    }

    public static void createCarList(int carCount) {
        for (int i = 0; i < carCount; i++) {
            cars.add(new Car());
        }
    }

    public int getCarDistance() {
        return distance.Distance();
    }
}
