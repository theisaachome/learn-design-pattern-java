package com.isaac.learn.shape;

public class ShapeClientCode {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new GreenColor());
        triangle.draw();
        System.out.println("++++++++++++++++++++++++");
        Shape circle = new CircleShape(new RedColor());
        circle.draw();

    }
}
