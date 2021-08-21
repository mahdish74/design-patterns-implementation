package factory.sample.client;


import factory.sample.ProductFactory;
import factory.sample.product.CarProduct;

import java.util.logging.Logger;


public class Main {
    private final static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        CarProduct suv = ProductFactory.getProduct("Suv");
        logger.info(suv.getName()+"\n");

        CarProduct hatchback = ProductFactory.getProduct("Hatchback");
        logger.info(hatchback.getName()+"\n");

        CarProduct convertible = ProductFactory.getProduct("Convertible");
        logger.info(convertible.getName()+"\n");

        try {
            CarProduct nonExistenceProduct = ProductFactory.getProduct("NonExistence");
            logger.info(nonExistenceProduct.getName());
        } catch (Exception ex) {
            logger.warning("non existence product type : " + ex.getMessage());
        }

    }
}
