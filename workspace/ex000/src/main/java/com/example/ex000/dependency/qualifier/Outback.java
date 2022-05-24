package com.example.ex000.dependency.qualifier;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
@Qualifier("outback")
public class Outback implements Restaurant {
    @Override
    public boolean checkSidebar() {
        return false;
    }
}
