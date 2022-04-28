package com.example.javaskb_springboot.Car.Weel;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(prefix = "car", name = "carSerialNumber", havingValue = "")
public class BigWheel implements IWheel{

    @Override
    public void Spin() {
        System.out.println("spin big wheel");
    }
}
