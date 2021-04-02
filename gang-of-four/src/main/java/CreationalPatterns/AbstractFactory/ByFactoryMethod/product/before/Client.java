package CreationalPatterns.AbstractFactory.ByFactoryMethod.product.before;

import CreationalPatterns.AbstractFactory.ByFactoryMethod.product.*;

public class Client {

    public static void testProducts(String company) {
        Tablet tablet;
        Smartphone smartphone;
        if (company.equals("Apple")) {
            tablet = new AppleTablet();
            tablet.switchOn();

            smartphone = new AppleSmartphone();
            smartphone.switchOn();
        } else if (company.equals("Samsung")) {
            tablet = new SamsungTablet();
            tablet.switchOn();

            smartphone = new SamsungSmartphone();
            smartphone.ring();
        }
    }
}
