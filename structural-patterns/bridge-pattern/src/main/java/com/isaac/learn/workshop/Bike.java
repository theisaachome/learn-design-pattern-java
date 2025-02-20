package com.isaac.learn.workshop;

public class Bike extends Vehicle {
    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println(" Bike Manufacture.");
        workshop1.work();
        workshop2.work();
    }
}
