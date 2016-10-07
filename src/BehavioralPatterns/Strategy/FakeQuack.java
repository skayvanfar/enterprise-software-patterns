package BehavioralPatterns.Strategy;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public class FakeQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwak");
    }
}
