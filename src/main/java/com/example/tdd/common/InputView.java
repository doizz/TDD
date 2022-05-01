package com.example.tdd.common;

import java.util.Scanner;

public class InputView {

//    private static int CarsCount;
    private static int TryCount;
    private static String carsName;

      public static void inputViewQuestion() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("자동차 대수는 몇 대 인가요?");
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        carsName = sc.nextLine();
        System.out.println("시도할 회수는 몇 회 인가요?");
        TryCount = sc.nextInt();
    }

    private InputView() {}

//    public static int getCarCount(){
//        return CarsCount;
//    }

    public static String getcarsName (){
        return carsName;
     }

    public static int getTryCount(){
        return TryCount;
    }
}
