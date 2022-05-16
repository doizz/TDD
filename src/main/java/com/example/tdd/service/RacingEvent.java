package com.example.tdd.service;

import com.example.tdd.common.InputView;
import com.example.tdd.common.ResultView;
import com.example.tdd.domain.Car;
import com.example.tdd.domain.Cars;
import com.example.tdd.domain.Winners;

import java.util.List;

public class RacingEvent {

    private static List<Car> carsList;

    //cars를 리턴받아야함. 일급컬렉션사용해야함.
    // private static List<Car> carsList;

    public RacingEvent() {
        this.carsList = carsList;
    }

    private void tryCarRacing(List<Car> cars){
        for(Car car : cars){
            car.carForward(new Forward());
            ResultView.carDistanceView(car);
        }
        Winners.maxDistance(cars);
    }

    public void racingStartCars() {
        //Car리스트 생성.
        carsList = Cars.createCarList(InputView.getcarsName());
        //이동하는거리 판단
        carMove(carsList);
    }

    private void carMove(List<Car> cars) {
        ResultView.resultStartMessage();
        for (int i = 0; i < InputView.getTryCount(); i++) {
            tryCarRacing(cars);
        }
        Winners.displayWinner(cars);
    }
}
