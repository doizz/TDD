package com.example.tdd.domain;

import com.example.tdd.common.ResultView;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private static int maxDistance = 0;

    public static void maxDistance(List<Car> cars) {
        for (Car car : cars) {
            maxDistance = car.maxDistance(maxDistance);
        }
    }

    public static void displayWinner(List<Car> cars) {
        List<String> winnerList = getWinner(cars);
        String winner = String.join(", ", winnerList.toArray(new String[winnerList.size()]));
        ResultView.resultMessage("최종우승자는 : " + winner);
    }

    public static List<String> getWinner(List<Car> cars) {
        List<String> winnerList = new ArrayList<>();
        for (Car car : cars) {
            if (car.isMaxDistance(maxDistance)) {
                winnerList.add(car.getCarName());
            }
        }
        return winnerList;
    }

    public Winners() {
    }

}
