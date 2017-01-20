package DomainLogicPatterns.DomainModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class Contract {

    private Product product;

    private Money revenue;

    private MfDate whenSigned;

    private Long id;

    private List<RevenueRecognition> revenueRecognitions = new ArrayList<RevenueRecognition>();

    public Money recognizedRevenue(MfDate asOf)
    {
        Money result = Money.dollars(0);
        Iterator<RevenueRecognition> it = revenueRecognitions.iterator();
        while (it.hasNext())
        {
            RevenueRecognition r = it.next();
            if (r.isRecognizableBy(asOf))
                result = result.add(r.getAmount());
        }
        return result;
    }

    public void calculateRecognitions()
    {
        product.calculateRevenueRecognitions(this);
    }

    public void addRevenueRecognition(RevenueRecognition r)
    {
        this.revenueRecognitions.add(r);
    }

    public Contract(Product product, Money revenue, MfDate whenSigned)
    {
        this.product = product;
        this.revenue = revenue;
        this.whenSigned = whenSigned;
    }

    public List<RevenueRecognition> getRevenueRecognitions()
    {
        return revenueRecognitions;
    }

    public void setRevenueRecognitions(List<RevenueRecognition> revenueRecognitions)
    {
        this.revenueRecognitions = revenueRecognitions;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }

    public Money getRevenue()
    {
        return revenue;
    }

    public void setRevenue(Money revenue)
    {
        this.revenue = revenue;
    }

    public MfDate getWhenSigned()
    {
        return whenSigned;
    }

    public void setWhenSigned(MfDate whenSigned)
    {
        this.whenSigned = whenSigned;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
}
