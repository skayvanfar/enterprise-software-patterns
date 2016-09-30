package StructuralPatterns.Decorator;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
public class Main {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


        // Or
        Beverage beverage3 = new Milk(new Mocha(new Mocha(new Espresso())));

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }
}
