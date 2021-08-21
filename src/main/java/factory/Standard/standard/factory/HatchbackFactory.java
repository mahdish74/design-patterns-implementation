package factory.Standard.standard.factory;

import factory.Standard.standard.product.CarProduct;
import factory.Standard.standard.product.Hatchback;

public class HatchbackFactory implements ProductFactory {
    @Override
    public CarProduct getProduct() {
        return new Hatchback();
    }
}
