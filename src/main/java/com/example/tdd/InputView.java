package com.example.tdd;

import java.util.Scanner;

public class InputView {

    private int CarsCount;
    private int TryCount;

      public void inputViewQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        int CarsCount = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int TryCount = sc.nextInt();
    }

    public int getCardCount(){
        return CarsCount;
    }

    public int getTryCount(){
        return TryCount;
    }
}
