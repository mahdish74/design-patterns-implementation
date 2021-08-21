package factory.Standard.standard.factory;

import factory.Standard.standard.product.CarProduct;
import factory.Standard.standard.product.Suv;

public class SuvFactory implements ProductFactory{
    @Override
    public CarProduct getProduct() {
        return new Suv();
    }
}
