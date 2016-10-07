package BehavioralPatterns.Visitor;

/**
 * Create a "visitor" base class with a visit() method for every "element" type
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public interface Visitor {
    void visit( This e ); // second dispatch
    void visit( That e );
    void visit( TheOther e );
}
