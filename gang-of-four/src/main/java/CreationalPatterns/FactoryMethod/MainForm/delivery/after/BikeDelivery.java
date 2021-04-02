package CreationalPatterns.FactoryMethod.MainForm.delivery.after;

import CreationalPatterns.FactoryMethod.MainForm.delivery.Bike;
import CreationalPatterns.FactoryMethod.MainForm.delivery.Vehicle;

public class BikeDelivery extends Delivery {
    @Override
    public Vehicle makeVehicle() {
        return new Bike();
    }
}
