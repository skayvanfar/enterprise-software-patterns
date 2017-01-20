package BehavioralPatterns.Iterator;

import java.util.Iterator;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 10/5/2016.
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
