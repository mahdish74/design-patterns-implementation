package factory.Standard.standard.client;


import factory.Standard.standard.factory.ConvertibleFactory;
import factory.Standard.standard.factory.ProductFactory;
import factory.Standard.standard.factory.SuvFactory;
import factory.Standard.standard.product.CarProduct;

import java.util.logging.Logger;


public class Main {
    private final static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ProductFactory suvFactory=new SuvFactory();
        CarProduct suv = suvFactory.getProduct();
        logger.info(suv.getName()+"\n");

        ProductFactory convertibleFactory=new ConvertibleFactory();
        CarProduct  convertible=convertibleFactory.getProduct();
        logger.info(convertible.getName()+"\n");

        ProductFactory hatchbackFactory=new ConvertibleFactory();
        CarProduct  hatchback=hatchbackFactory.getProduct();
        logger.info(hatchback.getName()+"\n");
    }
}
