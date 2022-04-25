package com.example.tdd;

import com.example.tdd.service.CarRacing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddApplication {

    public static void main(String[] args) {
        SpringApplication.run(TddApplication.class, args);

        CarRacing carRacing = new CarRacing();
        carRacing.racingStart();
    }
}
