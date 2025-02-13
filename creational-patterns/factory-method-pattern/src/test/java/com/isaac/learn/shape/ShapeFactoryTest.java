package com.isaac.learn.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    @Test
    void test(){
      var obj=  ShapeFactory.getShape(ShapeType.CIRCLE);
      obj.draw();
    }
}