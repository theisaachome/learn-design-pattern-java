package com.isaac.learn.duck.turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("Fly fly a short distance");
    }
}
