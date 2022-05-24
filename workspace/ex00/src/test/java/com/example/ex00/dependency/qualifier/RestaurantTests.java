package com.example.ex00.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RestaurantTests {
    @Autowired
    private Restaurant restaurant;

    @Test
    public void RestaurantTest2(){
        log.info("--------------------------------------");
        log.info("restaurant : " + restaurant.steak());
        log.info("restaurant : " + restaurant.sidebar());
        log.info("--------------------------------------");
    }
}
