package CreationalPatterns.Builder.MainForm;

import CreationalPatterns.Builder.MainForm.builder.PizzaBuilder;
import CreationalPatterns.Builder.MainForm.builder.PizzaBuilderType;

/**
 * A customer ordering a pizza.
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class Main {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = PizzaBuilder.getInstance(PizzaBuilderType.HAWAIIAN_PIZZA_BUILDER);

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();
    }
}
