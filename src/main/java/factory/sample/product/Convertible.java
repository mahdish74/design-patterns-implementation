package factory.sample.product;

public class Convertible implements CarProduct{
    @Override
    public String getName() {
        return "this is "+this.getClass().getName();
    }
}
