package com.example.tdd.domain;

import com.example.tdd.service.Forward;

public class Car {

    private Distance distance;

    public Car() {
        this.distance = new Distance();
    }

    public void carForward(){
        if(new Forward().isCarMoving()){
            this.distance.moveForward();
        }
    }
    public int getCarDistance() {
        return distance.Distance();
    }
}
