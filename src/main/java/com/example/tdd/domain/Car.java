package com.example.tdd.domain;

import com.example.tdd.service.MovableStrategy;

import java.util.Objects;

public class Car {
    private Distance distance;
    private Name name;

    public Car(String carName) {
        this(new Name(carName), new Distance());
    }

    public Car(Name name, Distance distance) {
        this.name = name;
        this.distance = distance;
    }

    public void carForward(MovableStrategy movableStrategy) {
        if (movableStrategy.isCarMoving()) {
            this.distance.moveForward();
        }
    }

    public boolean isMaxDistance(int maxDistance) {
        return this.getCarDistance() == maxDistance;
    }

    public int maxDistance(int maxDistance) {
        if (maxDistance < this.getCarDistance()) {
            return this.getCarDistance();
        }
        return maxDistance;
    }

    public int getCarDistance() {
        return distance.Distance();
    }

    public String getCarName() {
        return name.getName();
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
