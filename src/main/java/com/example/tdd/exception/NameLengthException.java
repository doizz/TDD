package com.example.tdd.exception;

public class NameLengthException extends IllegalArgumentException{

    public NameLengthException(String message){
        super(message);
    }
}
