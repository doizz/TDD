package com.example.tdd.service;

import com.example.tdd.common.InputView;
import com.example.tdd.common.ResultView;
import com.example.tdd.domain.Car;

import java.util.List;

import static com.example.tdd.domain.Distance.moveForward;

public class RacingEvent {

    public static void carMove(List<Car> cars) {
        System.out.println("cars.size() = " + cars.size());
        for (int i = 0; i < InputView.getTryCount(); i++) {
            for(Car car : cars){
                carForward();
                ResultView.carDistanceView(car);
            }
            System.out.println("1111");
        }

    }

    public static void carForward(){
        if(new Forward().isCarMoving()){
            moveForward();
        }
    }

}
