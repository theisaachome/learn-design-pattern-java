package com.isaac.learn.car;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return  new Sedan();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new NorthAmericaSpecification();
    }
}
