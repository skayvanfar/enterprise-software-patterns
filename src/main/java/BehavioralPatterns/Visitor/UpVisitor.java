package BehavioralPatterns.Visitor;

/**
 * Create a "visitor" derived class for each "operation" to perform on "elements"
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public class UpVisitor implements Visitor {

    @Override
    public void visit( This e ) {
        System.out.println( "do Up on " + e.thiss() );
    }

    @Override
    public void visit( That e ) {
        System.out.println( "do Up on " + e.that() );
    }

    @Override
    public void visit( TheOther e ) {
        System.out.println( "do Up on " + e.theOther() );
    }
}
