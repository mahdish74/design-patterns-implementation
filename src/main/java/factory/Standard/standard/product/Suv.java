package factory.Standard.standard.product;


public class Suv implements CarProduct {
    @Override
    public String getName() {
        return "this is " + this.getClass().getName();
    }
}
