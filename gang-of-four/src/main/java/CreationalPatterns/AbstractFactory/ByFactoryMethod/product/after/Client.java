package CreationalPatterns.AbstractFactory.ByFactoryMethod.product.after;

import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.Smartphone;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.Tablet;

public class Client {
    void testProducts(DeviceFactory factory) {
        Smartphone smartphone = factory.createSmartphone();
        smartphone.ring();

        Tablet tablet = factory.createTablet();

        tablet.switchOn();
    }
}
