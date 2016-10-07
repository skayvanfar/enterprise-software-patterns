package BehavioralPatterns.Visitor;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public class This implements Element {

    // 1. accept(Visitor) implementation
    @Override
    public void   accept( Visitor v ) {
        v.visit( this );
    }
    public String thiss() {
        return "This";
    }
}
