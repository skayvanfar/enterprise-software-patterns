package DomainLogicPatterns.ServiceLayer;

import java.util.Date;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 2/3/2017.
 */
public class Contract {
    public static Contract readForUpdate(long contractNumber) {
        return null;
    }

    public void calculateRecognitions() {

    }

    public String getAdministratorEmailAddress() {
        return "";
    }

    public static Contract read(long contractNumber) {
        return null;
    }

    public Money recognizedRevenue(Date asOf) {
        return null;
    }
}
