package abstractfactory.product;


import abstractfactory.factory.Shape;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("this is rounded square.");
    }
}
