package CreationalPatterns.AbstractFactory.ByFactoryMethod.product.after;

import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.AppleSmartphone;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.AppleTablet;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.Smartphone;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.Tablet;

public class AppleFactory extends DeviceFactory {
    @Override
    Smartphone createSmartphone() {
        return new AppleSmartphone();
    }

    @Override
    Tablet createTablet() {
        return new AppleTablet();
    }
}
