package BehavioralPatterns.Mediator;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/6/2016.
 */
public class Consumer extends Thread {

    // Consumers are coupled only to the Mediator
    private Mediator med;
    private int    id;
    private static int num = 1;
    public Consumer( Mediator m ) {
        med = m;
        id = num++;
    }
    public void run() {
        while (true) {
            System.out.println("c" + id + "-" + med.retrieveMessage() + "  ");
        }
    }
}
