package BasePatterns.ServiceStubOrMockObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Gateway
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class ChargeGenerator {

    public Charge[] calculateCharges(BillingSchedule schedule) {
        List charges = new ArrayList();
        Charge baseCharge = new Charge(schedule.getBillingAmount(), false);
        charges.add(baseCharge);
        TaxInfo info = TaxService.INSTANCE.getSalesTaxInfo(
                schedule.getProduct(), schedule.getAddress(), schedule.getBillingAmount());
        if (info.getStateRate().compareTo(new BigDecimal(0)) > 0) {
            Charge taxCharge = new Charge(info.getStateAmount(), true);
            charges.add(taxCharge);
        }
        return (Charge[]) charges.toArray(new Charge[charges.size()]);
    }
}
