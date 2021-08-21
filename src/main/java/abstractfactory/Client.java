package abstractfactory;

import abstractfactory.factory.AbstractShapeFactory;
import abstractfactory.factory.FactoryProducer;
import abstractfactory.factory.Shape;
import abstractfactory.factory.ShapeType;

import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        AbstractShapeFactory abstractShapeFactory = FactoryProducer.getShapeFactory();
        shapes.add(abstractShapeFactory.getShape(ShapeType.RECTANGLE));
        shapes.add(abstractShapeFactory.getShape(ShapeType.SQUARE));
        abstractShapeFactory = FactoryProducer.getRoundedShapeFactory();
        shapes.add(abstractShapeFactory.getShape(ShapeType.ROUNDED_RECTANGLE));
        shapes.add(abstractShapeFactory.getShape(ShapeType.ROUNDED_SQUARE));
        shapes.forEach(Shape::draw);
    }
}
