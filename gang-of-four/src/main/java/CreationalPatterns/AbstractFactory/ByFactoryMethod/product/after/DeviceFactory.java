package CreationalPatterns.AbstractFactory.ByFactoryMethod.product.after;

import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.Smartphone;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.Tablet;

public abstract class DeviceFactory {

    abstract Smartphone createSmartphone();
    abstract Tablet createTablet();
}
