package com.example.tdd;

import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.transform.Result;
import java.util.Random;
import java.util.Scanner;

public class CarRacing {

    private InputView inputView;
    private ResultView resultView;

    public CarRacing(){
        this.inputView = new InputView();
        this.resultView = new ResultView();
    }
    public void goGame() {

        /*
        InputView inputView = new InputView();
        ResultView resultView = new ResultView();
        */

        Scanner scanner = new Scanner(System.in);
        int value = inputView.CarsCount(scanner);
        int number = inputView.TryCount(scanner);

        String[] car = new String[value];
        ArrayReset(car);
        for (int j = 0; j < number; j++) {
            CarsGoAndStop(car);
            resultView.resultView(car);
        }

    }


    private static void ArrayReset(String[] car) {
        for (int i = 0; i < car.length; i++) {
            car[i] = "";
        }
    }

    //자동차가 이동할지 멈출지 판별한다.
    private static void CarsGoAndStop(String[] car) {
        for (int i = 0; i < car.length; i++) {
            car[i] += randomCount();
        }
    }

    //random메소드를 사용하여 4이상일 경우에만 전진을 한다.
    private static String randomCount() {
        Random random = new Random();
        return random.nextInt(10) >= 4 ? "-": "";
    }


}
