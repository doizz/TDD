package com.example.tdd.service;

import com.example.tdd.common.InputView;
import com.example.tdd.common.ResultView;
import com.example.tdd.domain.Car;
import com.example.tdd.domain.Cars;

import java.util.List;

public class RacingEvent {

    private Cars cars;
    private static List<Car> carsList;

    public RacingEvent() {
        this.carsList = carsList;
    }

    private void tryCarRacing(List<Car> cars){

        for(Car car : cars){
            car.carForward();
            ResultView.carDistanceView(car);
        }
    }

    public void moveCars() {
        //Car리스트 생성.
        carsList = Cars.createCarList(InputView.getCarCount());
        //이동하는거리 판단
        carMove(carsList);
    }

    private void carMove(List<Car> cars) {
        ResultView.resultStartMessage();
        for (int i = 0; i < InputView.getTryCount(); i++) {
            tryCarRacing(cars);
        }
    }
}
