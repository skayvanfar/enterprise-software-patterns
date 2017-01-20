package StructuralPatterns.Decorator;

/**
 * Concrete Component
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
