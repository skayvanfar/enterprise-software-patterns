package BasePatterns.Plugin;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class Counter implements IdGenerator {

    private long count = 0;

    @Override
    public Long nextId() {
        return new Long(count++);
    }
}
