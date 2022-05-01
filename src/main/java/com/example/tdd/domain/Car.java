package com.example.tdd.domain;

import com.example.tdd.service.Forward;

public class Car {

    private static final int CAR_NAME_MAX_LENGTH =10;
    private Distance distance;
    private String name;

    public Car(String name) {
        nameLengthValidation(name);
        this.name = name;
        this.distance = new Distance();
    }

    private void nameLengthValidation(String name) {
        if(name.length() > CAR_NAME_MAX_LENGTH){
            throw new IllegalArgumentException();
        }
    }

    public void carForward(){
        if(new Forward().isCarMoving()){
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
