package BehavioralPatterns.Visitor;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public class TheOther implements Element {

    @Override
    public void   accept( Visitor v ) {
        v.visit( this );
    }

    public String theOther() {
        return "TheOther";
    }
}
