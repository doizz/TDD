package com.example.tdd.exception;

public class NameException extends IllegalArgumentException{

    public NameException(String message){
        super(message);
    }
}
