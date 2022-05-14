package com.example.tdd;

import com.example.tdd.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    public static List<Car> findWinners(List<Car> cars) {
        return findWinners(cars, maxDistance(cars));
    }

    private static List<Car> findWinners(List<Car> cars, int maxDistance) {
        List<Car> winners = new ArrayList<>();
        for(Car car : cars){
            if(car.isMaxDistance(maxDistance)){
                winners.add(car);
            }
        }
        return winners;
    }

    private static int maxDistance(List<Car> cars) {
        int maxDistance = 0;
        for (Car car : cars){
            maxDistance = car.maxDistance(maxDistance);
        }
        return maxDistance;
    }
}
