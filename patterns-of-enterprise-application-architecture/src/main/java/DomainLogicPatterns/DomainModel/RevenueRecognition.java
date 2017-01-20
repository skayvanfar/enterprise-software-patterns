package DomainLogicPatterns.DomainModel;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class RevenueRecognition {

    private Money amount;

    private MfDate date;

    public RevenueRecognition(Money amount, MfDate date)
    {
        this.amount = amount;
        this.date = date;
    }

    public Money getAmount()
    {
        return amount;
    }

    boolean isRecognizableBy (MfDate asof)
    {
        return asof.after(date) || asof.equals(date);
    }
}
