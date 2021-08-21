package bridge.shape.shape;

import bridge.shape.color.Color;

public abstract class Shape {
     Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void createShape();
}
