package abstractfactory.factory;


import abstractfactory.product.Rectangle;
import abstractfactory.product.Square;

public class ShapeFactory implements AbstractShapeFactory {
    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                throw new RuntimeException("This Factory Can Not Build Other Types.");
        }
    }
}
