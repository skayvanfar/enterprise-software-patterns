package CreationalPatterns.FactoryMethod.MainForm.delivery.after;

import CreationalPatterns.FactoryMethod.MainForm.delivery.Car;
import CreationalPatterns.FactoryMethod.MainForm.delivery.Vehicle;

public class CarDelivery extends Delivery {
    @Override
    public Vehicle makeVehicle() {
        return new Car();
    }
}
