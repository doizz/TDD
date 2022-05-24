package com.example.tdd.service;

import com.example.tdd.common.InputView;

public class CarRacing {
    public void racingStart() {
        RacingEvent racingEvent = new RacingEvent();
        String carsName = InputView.inputViewCarsNameQuestion();
        int tryCount = InputView.inputViewTryCountQuestion();
        racingEvent.racingStartCars(carsName, tryCount);
    }
}