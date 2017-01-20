package BasePatterns.ServiceStubOrMockObject;

import java.math.BigDecimal;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class ExemptProductTaxService implements TaxService {

    private static final String EXEMPT_STATE = "IL";
    private static final String EXEMPT_PRODUCT = "12300";

    @Override
    public TaxInfo getSalesTaxInfo(String productCode, Address addr, Money saleAmount) {
        if (productCode.equals(EXEMPT_PRODUCT) && addr.getStateCode().equals(EXEMPT_STATE)) {
            return new TaxInfo(EXEMPT_RATE, saleAmount.multiply(EXEMPT_RATE));
        } else {
            return new TaxInfo(FLAT_RATE, saleAmount.multiply(FLAT_RATE));
        }
    }

}
