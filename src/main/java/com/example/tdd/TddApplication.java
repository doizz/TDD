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
}
