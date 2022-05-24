package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RestaurantTest {
    @Autowired
    private Restaurant restaurant;

    @Test
    public void RestaurantTest1(){
        log.info("--------------------------------------");
        log.info("restaurant : " + restaurant);
        log.info("restaurant : " + restaurant.getChef());
        log.info("--------------------------------------");
    }
}
