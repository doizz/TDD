package com.example.tdd.service;

import com.example.tdd.common.ResultView;
import com.example.tdd.domain.Car;
import com.example.tdd.domain.Cars;
import com.example.tdd.domain.Winners;

import java.util.List;

public class RacingEvent {
    private void tryCarRacing(List<Car> cars) {
        for (Car car : cars) {
            car.carForward(new Forward());
            ResultView.carDistanceView(car);
        }
        Winners.maxDistance(cars);
    }

    public void racingStartCars(String carsName, int tryCount) {
        List<Car> carsList = Cars.createCarList(carsName);
        carMove(carsList, tryCount);
    }

    private void carMove(List<Car> cars, int tryCount) {
        ResultView.resultStartMessage();
        for (int i = 0; i < tryCount; i++) {
            tryCarRacing(cars);
        }
        Winners.displayWinner(cars);
    }
}
