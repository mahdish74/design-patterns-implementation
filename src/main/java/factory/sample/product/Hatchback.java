package factory.sample.product;


public class Hatchback implements CarProduct {
    @Override
    public String getName() {
        return "this is " + this.getClass().getName();
    }
}
