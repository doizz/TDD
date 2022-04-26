package com.example.tdd.service;

import com.example.tdd.common.InputView;
import com.example.tdd.domain.Car;

public class CarRacing {
    public void racingStart() {
        // car의 대수, 시도할 횟수를 받는 inputView 메소드 1개
       InputView.inputViewQuestion();
        //입력받은 횟수로 비즈니스 로직이 들어가는 메소드 1개
        Car.moveCars();
    }
}