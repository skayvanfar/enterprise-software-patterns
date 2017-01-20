package DomainLogicPatterns.TransactionScript;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class ApplicationException extends Throwable {

    private static final long serialVersionUID = 7575447914636815160L;
    private Exception e;

    public ApplicationException(Exception e) {
        this.e = e;
    }

    @Override
    public String getMessage() {
        return e.getMessage();
    }
}
