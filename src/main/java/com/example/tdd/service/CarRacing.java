package com.example.tdd.service;

import com.example.tdd.common.InputView;

public class CarRacing {
    public void racingStart() {
        RacingEvent racingEvent = new RacingEvent();
        // car의 대수, 시도할 횟수를 받는 inputView 메소드 1개
        InputView.inputViewQuestion();
        //입력받은 횟수로 비즈니스 로직이 들어가는 메소드 1개
        racingEvent.racingStartCars();
    }
}