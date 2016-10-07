package BehavioralPatterns.Visitor;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/7/2016.
 */
public interface Element {
    // 1. accept(Visitor) interface
    void accept( Visitor v ); // first dispatch
}
