package abstractfactory.product;


import abstractfactory.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("this is rectangle.");
    }
}
