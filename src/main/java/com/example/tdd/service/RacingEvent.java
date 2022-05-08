package com.example.tdd.service;

import com.example.tdd.common.InputView;
import com.example.tdd.common.ResultView;
import com.example.tdd.domain.Car;
import com.example.tdd.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class RacingEvent {

    private Cars cars;
    private static List<Car> carsList;
    public static int maxDistance =0;


    public RacingEvent() {
        this.carsList = carsList;
    }

    private void tryCarRacing(List<Car> cars){
        for(Car car : cars){
            car.carForward(new Forward());
            ResultView.carDistanceView(car);
        }
        maxDistacne(cars);
    }

    public void racingStartCars() {
        //Car리스트 생성.
//        carsList = Cars.createCarList(InputView.getCarCount());
        carsList = Cars.createCarList(InputView.getcarsName());
        //이동하는거리 판단
        carMove(carsList);
    }

    private void carMove(List<Car> cars) {
        ResultView.resultStartMessage();
        for (int i = 0; i < InputView.getTryCount(); i++) {
            tryCarRacing(cars);
        }
        displayWinner(cars);
    }

    private void maxDistacne(List<Car> cars) {
        for (Car car : cars) {
            if (car.getCarDistance() > maxDistance) {
                maxDistance = car.getCarDistance();
            }
        }
    }

    private void displayWinner(List<Car> cars) {
        List<String> winnerList = getWinner(cars);

        String[] winnerArr = winnerList.toArray(new String[winnerList.size()]);
        String winner = String.join(", ", winnerArr);

        ResultView.resultMessage("최종우승자는 : " + winner);
    }

    public static List<String> getWinner(List<Car> carList) {
        List<String> winnerList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getCarDistance() == maxDistance) {
                winnerList.add(car.getCarName());
            }
        }
        return winnerList;
    }
}
