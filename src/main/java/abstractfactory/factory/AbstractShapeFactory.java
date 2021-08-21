package abstractfactory.factory;


public interface AbstractShapeFactory {
    Shape getShape(ShapeType shapeType);
}
