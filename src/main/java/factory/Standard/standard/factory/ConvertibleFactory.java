package factory.Standard.standard.factory;

import factory.Standard.standard.product.CarProduct;
import factory.Standard.standard.product.Convertible;

public class ConvertibleFactory implements ProductFactory {
    @Override
    public CarProduct getProduct() {
        return new Convertible();
    }
}
