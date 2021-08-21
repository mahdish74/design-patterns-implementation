package factory.sample;


import factory.sample.product.Convertible;
import factory.sample.product.Suv;
import factory.sample.product.Hatchback;
import factory.sample.product.CarProduct;

public class ProductFactory {
    private ProductFactory() {
    }

    public static CarProduct getProduct(String productType) {
        switch (productType) {
            case "Hatchback":
                return new Hatchback();
            case "Suv":
                return new Suv();
            case "Convertible":
                return new Convertible();
            default:
                throw new IllegalStateException("Product Type Is Not Valid.");
        }
    }
}
