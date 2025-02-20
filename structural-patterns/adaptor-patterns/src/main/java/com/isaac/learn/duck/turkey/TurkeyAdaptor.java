package com.isaac.learn.duck.turkey;

import com.isaac.learn.duck.Duck;

public class TurkeyAdaptor implements Duck {

    Turkey turkey;
    public TurkeyAdaptor(Turkey turkey) {this.turkey = turkey;}
    @Override
    public void quack() {
        this.turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i=0; i < 5; i++) this.turkey.fly();
    }
}
