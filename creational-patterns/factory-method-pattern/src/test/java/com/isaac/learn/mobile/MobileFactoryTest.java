package com.isaac.learn.mobile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobileFactoryTest {

    @Test
    void testI(){
        MobileFactory mobileFactory = new MobileFactory();
        mobileFactory.createMobile("iphone");
        mobileFactory.createMobile("samsung");
    }
}