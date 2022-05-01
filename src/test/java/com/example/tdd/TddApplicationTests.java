package com.example.tdd;

import com.example.tdd.domain.Car;
import com.example.tdd.service.Forward;
import com.example.tdd.service.RacingEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class TddApplicationTests {

//    @BeforeEach
//    void beforeEach() {Car car = new Car();}

    @Test
    void 객체생성() {

    }

    @Test
    void 숫자가4이상일경우(){
        Forward forward = new Forward();
        if(forward.isCarMoving()){
            System.out.println("이동");
        }
        System.out.println("멈춤");
    }
    @Test
    void 이동거리테스트(){
        assertEquals(new Forward().isCarMoving(), true);
        assertEquals(new Forward().isCarMoving(), true);
        assertEquals(new Forward().isCarMoving(), true);
    }

    @Test
    void 자동차이름부여(){
        Car car1 = new Car("aaa");
        Car car2 = new Car("bbb");
    }

    @Test
    void  자동차이름5글자초과(){
        String name = "aaaa";
        if(name.length() > 5){
            throw new IllegalArgumentException("글자수 초과");
        }
        System.out.println("name = " + name);
    }

    @Test
    void 자동차이름은쉼표로구분(){
        List<String> carName = new ArrayList<String>();
        carName.add("aaa");
        carName.add("bbb");
        carName.add("ccc");

        String[] winnerArr = carName.toArray(new String[carName.size()]);
        String winner = String.join(", ", winnerArr);

        System.out.println("winner = " + winner);
    }

}
