package CreationalPatterns.AbstractFactory.ByFactoryMethod.product.after;

import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.SamsungSmartphone;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.SamsungTablet;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.Smartphone;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.Tablet;

public class SamsungFactory extends DeviceFactory {
    @Override
    Smartphone createSmartphone() {
        return new SamsungSmartphone();
    }

    @Override
    Tablet createTablet() {
        return new SamsungTablet();
    }
}
