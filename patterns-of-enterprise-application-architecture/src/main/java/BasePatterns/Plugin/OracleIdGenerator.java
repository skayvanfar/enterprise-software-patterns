package BasePatterns.Plugin;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class OracleIdGenerator implements IdGenerator {

    private String sequence;
    private String datasource;

    public OracleIdGenerator() {
        this.sequence = Environment.getProperty("id.sequence");
        this.datasource = Environment.getProperty("id.source");
    }

    @Override
    public Long nextId() {
        return null;
    }
}
