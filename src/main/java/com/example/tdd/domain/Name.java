package com.example.tdd.domain;

import com.example.tdd.exception.NameException;

public class Name {
    private static final int CAR_NAME_MAX_LENGTH = 5;
    private String name = "";
    public Name(String name) {
        nameLengthValidation();
        this.name = name;
    }
    void nameLengthValidation() {
        nameLengthCheck();
    }

    private void nameLengthCheck() {
        if(name.length() > CAR_NAME_MAX_LENGTH){
            throw new NameException("이름은 5글자를 넘어갈수 없습니다.");
        }
    }
    public String getName(){return this.name;}
}
