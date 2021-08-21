package factory.sample.product;


public class Suv implements CarProduct {
    @Override
    public String getName() {
        return "this is " + this.getClass().getName();
    }
}
