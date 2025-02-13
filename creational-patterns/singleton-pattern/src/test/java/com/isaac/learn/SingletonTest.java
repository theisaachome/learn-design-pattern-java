package com.isaac.learn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void test(){
        var obj = Singleton.getInstance();
        obj.doSomething();
    }

}