package com.example.tdd.domain;

public class Distance {

    private static int distance = 0;

    public int Distance (){
        return this.distance;
    }

    public static void moveForward(){
        distance++;
    }

    public Distance(){}
}
