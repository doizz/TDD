package com.example.tdd.domain;

import com.example.tdd.service.Forward;
import com.example.tdd.service.MovableStrategy;

public class Car {

    private static final int CAR_NAME_MAX_LENGTH =10;
    private Distance distance;
    private String name;
    private MovableStrategy movableStrategy;


    public Car(String name ) {
        nameLengthValidation(name);
        this.name = name;
        this.distance = new Distance();
    }

    private void nameLengthValidation(String name) {
        if(name.length() > CAR_NAME_MAX_LENGTH){
            throw new IllegalArgumentException();
        }
    }

    public void carForward(MovableStrategy movableStrategy){
        if(movableStrategy.isCarMoving()){
            this.distance.moveForward();
        }
    }
    public int getCarDistance() {
        return distance.Distance();
    }
    public String getCarName(){
        return name;
    }
}
