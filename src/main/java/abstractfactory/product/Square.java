package abstractfactory.product;


import abstractfactory.factory.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("this is square.");
    }
}
