package bridge.shape;

import bridge.shape.color.Color;
import bridge.shape.color.Red;
import bridge.shape.shape.Circle;
import bridge.shape.shape.Shape;

public class Main {
    public static void main(String[] args) {
        Color red = new Red();
        Shape circle = new Circle(red);
        circle.createShape();
    }
}
