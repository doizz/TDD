package com.example.tdd.common;

import com.example.tdd.domain.Car;

import java.util.Scanner;

public class ResultView {
    public static void resultMessage(String message){System.out.print(message);}
    public static void newLine(){System.out.println();}
    public static void resultStartMessage(){System.out.println("실행결과");}

    public static void carDistanceView(Car car){
        for (int i = 0; i <= car.getCarDistance(); i++) {
            System.out.print("-");
        }

    }
}
