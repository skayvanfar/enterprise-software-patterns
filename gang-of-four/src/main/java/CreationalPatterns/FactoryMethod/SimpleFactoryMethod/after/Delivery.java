package CreationalPatterns.FactoryMethod.SimpleFactoryMethod.after;

import CreationalPatterns.FactoryMethod.SimpleFactoryMethod.Bike;
import CreationalPatterns.FactoryMethod.SimpleFactoryMethod.Car;
import CreationalPatterns.FactoryMethod.SimpleFactoryMethod.Vehicle;

public class Delivery {
    public Vehicle makeVehicle(String mode) {
        Vehicle vehicle = null;
        if (mode.equals("bike")) {
            vehicle = new Bike();
            vehicle.setMode("eco");
        } else if (mode.equals("Car")) {
            vehicle = new Car();
        }
        return vehicle;
    }

    public void handle(String mode) {
        Vehicle vehicle = this.makeVehicle(mode);
        vehicle.move();
    }
}
