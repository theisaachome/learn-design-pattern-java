package com.isaac.learn.vehicle;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
