package BasePatterns.ServiceStubOrMockObject;

import java.math.BigDecimal;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public interface TaxService {

    static final BigDecimal EXEMPT_RATE = new BigDecimal("0.0000");
    static final BigDecimal FLAT_RATE = new BigDecimal("0.0500");

    public static final TaxService INSTANCE = (TaxService) PluginFactory.getPlugin(TaxService.class);
    public TaxInfo getSalesTaxInfo(String productCode, Address addr, Money saleAmount);
}
