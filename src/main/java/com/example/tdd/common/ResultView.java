package com.example.tdd.common;

import com.example.tdd.domain.Car;

public class ResultView {
    public static void resultMessage(Object message){System.out.print(message);}
    public static void newLine(){System.out.println();}
    public static void resultStartMessage(){System.out.println("실행결과");}

    public static void carDistanceView(Car car){
        for (int i = 0; i < car.getCarDistance(); i++) {
            resultMessage("-");
        }
        newLine();
    }
}
