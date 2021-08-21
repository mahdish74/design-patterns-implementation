package bridge.shape.shape;

import bridge.shape.color.Color;

public class Circle extends Shape {


    public Circle(Color color) {
        super(color);
    }

    @Override
    public void createShape() {
        System.out.println("this is a " + color.getColor() + " Circle");
    }
}
