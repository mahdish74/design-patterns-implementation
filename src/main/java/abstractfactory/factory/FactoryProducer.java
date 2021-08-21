package abstractfactory.factory;


public class FactoryProducer {
    public static AbstractShapeFactory getRoundedShapeFactory() {
        return new RoundedShapeFactory();
    }

    public static AbstractShapeFactory getShapeFactory() {
        return new ShapeFactory();
    }
}
