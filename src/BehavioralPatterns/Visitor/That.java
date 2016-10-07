package BehavioralPatterns.Visitor;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public class That implements Element {

    @Override
    public void   accept( Visitor v ) {
        v.visit( this );
    }
    public String that() {
        return "That";
    }
}
