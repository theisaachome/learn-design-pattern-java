package com.isaac.learn.mobile;

public class Iphone implements IMobile{
    @Override
    public void price() {
        System.out.println("Iphone Price 600");
    }

    @Override
    public void storage() {
        System.out.println("Iphone Storage available: 1TB");
    }

    @Override
    public void battery() {
        System.out.println("Iphone Battery last: 48 hr");
    }
}
