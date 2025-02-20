package com.isaac.learn.shape;

public class CircleShape extends Shape{
    public CircleShape(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
        System.out.print("Filling a Circle with ");
        color.fillColor();
    }
}
