package com.example.ex00.dependency.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Vips implements Restaurant {
    @Override
    public int steak() {
        return 50000;
    }

    @Override
    public String sidebar() {
        return "10만원 이상 이용가능";
    }
}
