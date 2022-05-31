package com.example.tdd.domain;

import com.example.tdd.exception.NameLengthException;

public class Name {
    private static final int CAR_NAME_MAX_LENGTH = 5;
    private String name = "";

    public Name(String name) {
        nameLengthValidation(name);
        this.name = name;
    }

    private void nameLengthValidation(String name) {
        if (name.length() > CAR_NAME_MAX_LENGTH) {
            throw new NameLengthException("이름은 5글자를 넘어갈수 없습니다.");
        }
    }

    public String getName() {
        return this.name;
    }
}
