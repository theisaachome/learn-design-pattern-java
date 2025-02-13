package com.isaac.learn.vehicle;

import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void testTwoWheeler(){
        Client twoWheelerCar = new Client(new TwoWheelerFactory());
        var two= twoWheelerCar.getVehicle();
        two.drive();
    }

    @Test
    void testFourWheeler(){
        var fourWheelerCar = new Client(new FourWheelerFactory());
        var four =  fourWheelerCar.getVehicle();
        four.drive();
    }
}