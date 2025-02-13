package com.isaac.learn.car;

public class EuropeCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return  new HatchBack();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new EuropeSpecification();
    }
}
