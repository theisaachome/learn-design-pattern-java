package com.isaac.learn.shape;

public class ShapeFactory {
    public static Shape getShape(ShapeType shapeType) {
        if (shapeType == null) {return null;}
      return   switch (shapeType) {
            case CIRCLE -> new Circle();
          case TRIANGLE -> new Triangle();
          case SQUARE ->  new Square();
            case RECTANGLE ->new Rectangle();
        };
    }
}
