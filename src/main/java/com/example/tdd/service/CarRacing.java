package com.example.tdd.service;

import com.example.tdd.common.InputView;
import com.example.tdd.common.ResultView;
import com.example.tdd.domain.Car;

import java.util.List;

public class CarRacing {
    public void racingStart() {

        // car의 대수, 시도할 횟수를 받는 inputView 메소드 1개
       InputView.inputViewQuestion();


        //입력받은 횟수로 비즈니스 로직이 들어가는 메소드 1개

        //List<Car> cars = Car.createCarList(inputView.getCarCount());
        Car.moveCars();



        //출력하는 메소드 1개로 분리하기
//        ResultView.resultStartMessage();
//        for (int i = 0; i < inputView.getTryCount(); i++) {
//            move(cars);
//        }
    }

}