package BehavioralPatterns.Mediator;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/6/2016.
 */
public class Main {

    public static void main( String[] args ) {
        Mediator mb = new Mediator();
        new Producer( mb ).start();
        new Producer( mb ).start();
        new Consumer( mb ).start();
        new Consumer( mb ).start();
        new Consumer( mb ).start();
        new Consumer( mb ).start();
    }
}
