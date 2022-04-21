package com.example.tdd;

import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CarRacing {

    private static final int RANDOM_MAX_VALUE =10;
    private static final int MIN_NUMBER =4;

    private ResultView resultView;
    public void goGame() {
        int number = 0;

        InputView inputView = new InputView();

        inputView.inputViewQuestion();
        Map<String, String> carsMap = new HashMap<String, String>();

        for (int i = 0; i < inputView.getCardCount(); i++) {
            carsMap.put("car"+i, "");
        }

        for (int j = 0; j < number; j++) {
            CarsGoAndStop(carsMap);
            resultView.resultView(carsMap);
        }

    }



    //자동차가 이동할지 멈출지 판별한다.
    private static void CarsGoAndStop(Map<String, String> carsMap) {
        System.out.println("carsMap.size() = " + carsMap.size());
        for (int i = 0; i < carsMap.size(); i++) {
            carsMap.put("car"+i , carsMap.get("car"+i)+randomCount());
        }
    }

    //random메소드를 사용하여 4이상일 경우에만 전진을 한다.
    private static String randomCount() {
        Random random = new Random();
        if(random.nextInt(RANDOM_MAX_VALUE) >= MIN_NUMBER){
            return "-";
        }
        return "";
    }


}
