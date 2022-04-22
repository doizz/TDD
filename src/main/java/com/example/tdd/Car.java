package com.example.tdd;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Car {
    private int distance = 0;
    private int number;

    public Car(int number){
        this.number = number;
    }

    public static List<Car> listCreate(int cardCount) {
        return IntStream.range(0,cardCount).mapToObj(Car::new).collect(Collectors.toList());
    }

    public void carMove(){
        if(CarService.moveCount()){
            moveForward();
        }
    }

    private void moveForward(){
        distance++;
    }

    public void distanceResultView() {
        for (int i = 0; i < this.distance; i++) {
            ResultView.resultMessage("-");
        }
        ResultView.newLine();
    }
}
