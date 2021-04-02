package CreationalPatterns.FactoryMethod.MainForm.delivery.after;

import CreationalPatterns.FactoryMethod.MainForm.delivery.Vehicle;

public abstract class Delivery {
    public abstract Vehicle makeVehicle();

    public void handle() {
        Vehicle vehicle = this.makeVehicle();
        vehicle.move();
    }
}
