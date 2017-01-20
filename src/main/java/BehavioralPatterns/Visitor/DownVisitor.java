package BehavioralPatterns.Visitor;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public class DownVisitor implements Visitor {

    @Override
    public void visit( This e ) {
        System.out.println( "do Down on " + e.thiss() );
    }

    @Override
    public void visit( That e ) {
        System.out.println( "do Down on " + e.that() );
    }

    @Override
    public void visit( TheOther e ) {
        System.out.println( "do Down on " + e.theOther() );
    }
}
