package factory;


public class ProductFactory {
    private ProductFactory() {
    }

    public static Product getProduct(String productType) {
        switch (productType) {
            case "My":
                return new MyProduct();
            case "Another":
                return new AnotherProduct();
            default:
                throw new IllegalStateException("Product Type Is Not Valid.");
        }
    }
}
