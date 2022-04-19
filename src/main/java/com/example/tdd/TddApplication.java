package com.example.tdd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

@SpringBootApplication
public class TddApplication {

    public static void main(String[] args) {
        SpringApplication.run(TddApplication.class, args);

        CarRacing carRacing = new CarRacing();
        carRacing.goGame();
    }

   /* //배열 초기화.
    private static void ArrayReset(String[] car) {
        for (int i = 0; i < car.length; i++) {
            car[i] = "";
        }
    }

    //자동차가 이동할지 멈출지 판별한다.
    private static void CarsGoAndStop(String[] car) {
        for (int i = 0; i < car.length; i++) {
            car[i] += randomCnt();
        }
    }

    //random메소드를 사용하여 4이상일 경우에만 전진을 한다.
    private static String randomCnt() {
        Random random = new Random();
        return random.nextInt(10) >= 4 ? "-": "";
    }*/

    //실행결과를 화면에 표출한다.
/*    private static void ResultView(String[] car) {
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
        System.out.println();
    }*/

}


        /*
        Scanner scanner = new Scanner(System.in);


        System.out.println("자동차 대수는 몇 대 인가요?");
        int value = sc.nextInt();
        System.out.println("시도할 회수는 몇 회 인가요?");
        int number = sc.nextInt();

        String[] car = new String[value];

        for (int i = 0; i < car.length; i++) {
            car[i] = "";
        }

        for (int j = 0; j < number; j++) {
            for (int i = 0; i < car.length; i++) {
                if(random.nextInt(10) >= 4){
                    car[i] += "=";
                }
            }
            ResultView(car);
        }

         private static void ResultView(String[] car) {
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
        System.out.println();
    }
        */

