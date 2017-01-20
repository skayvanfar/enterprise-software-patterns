package CreationalPatterns.Builder.MainForm.builder;

import CreationalPatterns.Builder.MainForm.Pizza;

/**
 * Abstract CreationalPatterns.Builder
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public abstract class PizzaBuilder {

    // Use Singleton
    private static final PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
    private static final PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();


    protected Pizza pizza;

    // Use Static Factory Method
    public static PizzaBuilder getInstance(PizzaBuilderType pizzaBuilderType) {
        switch (pizzaBuilderType) {
            case HAWAIIAN_PIZZA_BUILDER:
                return hawaiianPizzaBuilder;
            case SPICY_PIZZA_BUILDER:
                return spicyPizzaBuilder;
            default:
                throw new IllegalArgumentException("Invalid pizzaBuilderType");
        }
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();
}
