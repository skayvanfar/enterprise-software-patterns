package BehavioralPatterns.ChainOfResponsibility;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public class Main {
    public static void main(String[] args) {
        Handler addHandler = new AddNumbersHandler();
        Handler subHandler = new AddNumbersHandler();

        addHandler.setNextHandler(subHandler);

        Numbers request = new Numbers(4, 2, "add");

        addHandler.calculate(request);
    }
}
