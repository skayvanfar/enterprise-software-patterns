package CreationalPatterns.FactoryMethod.FactoryMethod.delivery.after;

import CreationalPatterns.FactoryMethod.FactoryMethod.delivery.Bike;
import CreationalPatterns.FactoryMethod.FactoryMethod.delivery.Vehicle;

public class BikeDelivery extends Delivery {
    @Override
    public Vehicle makeVehicle() {
        return new Bike();
    }
}
