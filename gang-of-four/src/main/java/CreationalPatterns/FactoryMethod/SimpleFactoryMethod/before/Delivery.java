package CreationalPatterns.FactoryMethod.SimpleFactoryMethod.before;

import CreationalPatterns.FactoryMethod.MainForm.delivery.Bike;
import CreationalPatterns.FactoryMethod.MainForm.delivery.Car;
import CreationalPatterns.FactoryMethod.MainForm.delivery.Vehicle;

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
