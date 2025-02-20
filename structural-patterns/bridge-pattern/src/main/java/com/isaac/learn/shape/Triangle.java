package com.isaac.learn.shape;

public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }
    @Override
    public void draw() {
        System.out.println("Draw Triangle");
        System.out.print("Filling Color on Triangle Shape with ");
        color.fillColor();
    }

}
