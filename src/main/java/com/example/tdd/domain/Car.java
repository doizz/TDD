package com.example.tdd.domain;

import com.example.tdd.service.Forward;
import com.example.tdd.service.MovableStrategy;

import java.util.Objects;

public class Car {

    private static final int CAR_NAME_MAX_LENGTH = 5;
    private Distance distance;
    private final String name;

    public Car(String name) {
        this(name, new Distance());
    }

    public Car(String name, Distance distance) {
        nameLengthValidation(name);
        this.name = name;
        this.distance = distance;
    }

    private void nameLengthValidation(String name) {
        if(name.length() > CAR_NAME_MAX_LENGTH){
            throw new IllegalArgumentException("이름은 5글자를 넘어갈수 없습니다.");
        }
    }

    public void carForward(MovableStrategy movableStrategy){
        if(movableStrategy.isCarMoving()){
            this.distance.moveForward();
        }
    }

    public boolean isMaxDistance(int maxDistance) {
        return this.getCarDistance() == maxDistance;
    }

    public int maxDistance(int maxDistance) {
        if(maxDistance < this.getCarDistance()){
            return this.getCarDistance();
        }
        return maxDistance;
    }


    public int getCarDistance() {
        return distance.Distance();
    }
    public String getCarName(){
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(distance, car.distance) && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance, name);
    }

}
