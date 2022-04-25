package com.example.tdd.common;

import java.util.Scanner;

public class InputView {

    private static int CarsCount;
    private static int TryCount;

      public static void inputViewQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        CarsCount = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        TryCount = sc.nextInt();
    }

    public static int getCarCount(){
        return CarsCount;
    }

    public static int getTryCount(){
        return TryCount;
    }
}
