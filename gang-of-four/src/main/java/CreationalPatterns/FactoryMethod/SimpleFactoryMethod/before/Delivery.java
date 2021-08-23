package CreationalPatterns.FactoryMethod.SimpleFactoryMethod.before;

import CreationalPatterns.FactoryMethod.FactoryMethod.delivery.Bike;
import CreationalPatterns.FactoryMethod.FactoryMethod.delivery.Car;
import CreationalPatterns.FactoryMethod.FactoryMethod.delivery.Vehicle;

public class Delivery {

    public void handle(String mode) {
        Vehicle vehicle;
        if (mode.equals("bike")) {
            vehicle = new Bike();
            vehicle.setMode("eco");
            vehicle.move();
        } else if (mode.equals("car")) {
            vehicle = new Car();
            vehicle.move();
        }
    }

}
