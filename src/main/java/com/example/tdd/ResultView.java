package com.example.tdd;

import java.util.Map;
import java.util.Scanner;

public class ResultView {

   /* public void resultView(String[] ArrayCars) {
        for (int i = 0; i < ArrayCars.length; i++) {
            System.out.println("car"+(i+1)+")"+ArrayCars[i]);
        }
        System.out.println();
    }*/

    public void resultView(Map CarsMap) {
        CarsMap.forEach((k,v)-> System.out.println("key: "+k+"   value: " +v));
    }
}
