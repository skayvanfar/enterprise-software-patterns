package CreationalPatterns.FactoryMethod.FactoryMethod.delivery.after;

import CreationalPatterns.FactoryMethod.FactoryMethod.delivery.Car;
import CreationalPatterns.FactoryMethod.FactoryMethod.delivery.Vehicle;

public class CarDelivery extends Delivery {
    @Override
    public Vehicle makeVehicle() {
        return new Car();
    }
}
