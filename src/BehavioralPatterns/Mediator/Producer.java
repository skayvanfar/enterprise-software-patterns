package BehavioralPatterns.Mediator;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/6/2016.
 */
public class Producer extends Thread {

    // Producers are coupled only to the Mediator
    private Mediator med;
    private int    id;
    private static int num = 1;

    public Producer(Mediator m) {
        med = m;
        id = num++;
    }
    public void run() {
        int num;
        while (true) {
            med.storeMessage( num = (int)(Math.random()*100) );
            System.out.println( "p" + id + "-" + num + "  " );
        }
    }
}
