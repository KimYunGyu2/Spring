package com.example.ex00.dependency.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("outback")
public class Outback implements Restaurant {
    @Override
    public int steak() {
        return 100000;
    }

    @Override
    public String sidebar() {
        return "이용가능";
    }
}
