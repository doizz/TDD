package com.example.tdd;

import com.example.tdd.domain.Car;
import com.example.tdd.domain.Distance;
import com.example.tdd.service.Forward;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class TddApplicationTests {


    @Test
    void 이동(){
        Car car = new Car("doizz");
        car.carForward(new Forward());
        assertThat(car.getCarDistance()).isEqualTo(1);
    }

    @Test
    void 이동거리테스트() {
//        assertEquals(new Forward().isCarMoving(), true);
//        assertEquals(new Forward().isCarMoving(), true);
//        assertEquals(new Forward().isCarMoving(), true);
    }

    @Test
    void 자동차이름부여() {
        Car car1 = new Car("aaa");
        Car car2 = new Car("bbb");
    }

    @Test
    void 자동차이름5글자초과() {
        String name = "aaaa";
        if (name.length() > 5) {
            throw new IllegalArgumentException("글자수 초과");
        }
        System.out.println("name = " + name);
    }

    @Test
    void 자동차이름은쉼표로구분() {
        List<String> carName = new ArrayList<String>();
        carName.add("aaa");
        carName.add("bbb");
        carName.add("ccc");

        String[] winnerArr = carName.toArray(new String[carName.size()]);
        String winner = String.join(", ", winnerArr);

    }


    @Test
    void 우승자찾기() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("man1", new Distance(3)));
        cars.add(new Car("man2", new Distance(2)));
        cars.add(new Car("man3", new Distance(1)));

        List<Car> winners = Winners.findWinners(cars);
        assertThat(winners).contains(new Car("man1", new Distance(3)));
    }

    @Test
    void 최대이동거리_유무() {
        int maxDistance = 3;
        assertThat(new Car("doizz", new Distance(3)).isMaxDistance(maxDistance)).isTrue();
        assertThat(new Car("doizz", new Distance(2)).isMaxDistance(maxDistance)).isFalse();
    }

    @Test
    void 최대이동거리_구하기() {
        Car car = new Car("doizz", new Distance(3));
        assertThat(car.maxDistance(2)).isEqualTo(3);
        assertThat(car.maxDistance(4)).isEqualTo(4);
    }

}