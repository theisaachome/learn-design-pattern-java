package com.isaac.learn.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFactoryTest {
    @Test
    void  testNorthAmericaCarFactory(){
        var northAmericaCarFactory = new NorthAmericaCarFactory();
        northAmericaCarFactory.createCar().assemble();
        northAmericaCarFactory.createCarSpecification().display();
    }

    @Test
    void testEuropeCarFactory(){
        var europeCarFactory = new EuropeCarFactory();
        europeCarFactory.createCar().assemble();
        europeCarFactory.createCarSpecification().display();
    }

}