package com.isaac.learn.mobile;

public class Samsung implements IMobile{
    @Override
    public void price() {
        System.out.println("Samsung price 400");
    }

    @Override
    public void storage() {
        System.out.println("Samsung storage 128GB");
    }

    @Override
    public void battery() {
        System.out.println("Samsung battery");
    }
}
