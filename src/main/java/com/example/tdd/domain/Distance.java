package com.example.tdd.domain;

import java.util.Objects;

public class Distance {

    private int distance = 0;

    public int Distance() {
        return distance;
    }

    public void moveForward() {
        distance++;
    }

    public Distance() {
    }

    public Distance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "distance=" + distance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Distance distance1 = (Distance) o;
        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(distance);
    }
}
