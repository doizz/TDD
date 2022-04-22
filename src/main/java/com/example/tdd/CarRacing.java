package com.example.tdd;

import java.util.List;

public class CarRacing {
    public void goGame() {

        InputView inputView = new InputView();
        inputView.inputViewQuestion();

        List<Car> cars = Car.listCreate(inputView.getCarCount());

        ResultView.resultStartMessage();
        for (int i = 0; i < inputView.getTryCount(); i++) {
            move(cars);
        }
    }

    public void move(List<Car> carsList){
        for (Car car : carsList) {
            car.carMove();
            car.distanceResultView();
        }
        ResultView.newLine();
    }
}