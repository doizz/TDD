package com.example.tdd;

import com.example.tdd.domain.Car;
import com.example.tdd.service.Forward;
import com.example.tdd.service.RacingEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TddApplicationTests {

    @BeforeEach
    void beforeEach() {Car car = new Car();}

    @Test
    void 객체생성() {

    }

    @Test
    void 이동거리테스트(){
        assertEquals(new Forward().isCarMoving(), true);
        assertEquals(new Forward().isCarMoving(), true);
        assertEquals(new Forward().isCarMoving(), true);
    }

}
