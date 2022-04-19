package com.example.tdd;

import java.util.Scanner;

public class ResultView {

    public void resultView(String[] car) {
        for (int i = 0; i < car.length; i++) {
            System.out.println("car"+(i+1)+")"+car[i]);
        }
        System.out.println();
    }
}
