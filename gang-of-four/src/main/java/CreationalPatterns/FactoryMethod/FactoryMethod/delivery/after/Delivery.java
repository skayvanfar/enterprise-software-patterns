package CreationalPatterns.FactoryMethod.FactoryMethod.delivery.after;

import CreationalPatterns.FactoryMethod.FactoryMethod.delivery.Vehicle;

public abstract class Delivery {
    public abstract Vehicle makeVehicle();

    public void handle() {
        Vehicle vehicle = this.makeVehicle();
        vehicle.move();
    }
}
