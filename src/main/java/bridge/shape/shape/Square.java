package bridge.shape.shape;

import bridge.shape.color.Color;

public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void createShape() {
        System.out.println("this is " + color.getColor() + "Circle");
    }
}
