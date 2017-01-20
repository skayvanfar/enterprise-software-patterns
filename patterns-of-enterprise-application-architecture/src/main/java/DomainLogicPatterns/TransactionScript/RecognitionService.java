package DomainLogicPatterns.TransactionScript;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Transaction Script
 *
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class RecognitionService {

    private Gateway db = new Gateway();

    /**
     * Query the amount of revenue that a contract has confirmed before the specified date.
     *
     * @param contractNumber
     * @param asof
     * @return
     * @throws ApplicationException
     */
    public Money recognizedRevenue(long contractNumber, MfDate asof) throws ApplicationException
    {
        Money result = Money.dollars(0);
        try
        {
            ResultSet rs = db.findRecognitionsFor(contractNumber, asof);
            while (rs.next())
            {
                result = result.add(Money.dollars(rs.getBigDecimal("amount")));
            }
            return result;
        }
        catch (SQLException e)
        {
            throw new ApplicationException(e);
        }
    }

    /**
     * Calculate the revenue recognition of the contract.
     *
     * @param contractNumber
     * @throws ApplicationException
     */
    public void calculateRevenueRecognitions(long contractNumber) throws ApplicationException
    {
        try
        {
            ResultSet contracts = db.findContract(contractNumber);
            contracts.next();
            Money totalRevenue = Money.dollars(contracts.getBigDecimal("revenue"));
            MfDate recognitionDate = new MfDate(contracts.getDate("dateSigned"));
            String type = contracts.getString("type");
            if (type.equals("S"))
            {
                Money[] allocation = totalRevenue.allocate(3);
                db.insertRecognition(contractNumber, allocation[0], recognitionDate);
                db.insertRecognition(contractNumber, allocation[1], recognitionDate.addDays(60));
                db.insertRecognition(contractNumber, allocation[2], recognitionDate.addDays(90));
            }
            else if (type.equals("W"))
            {
                db.insertRecognition(contractNumber, totalRevenue, recognitionDate);
            }
            else if (type.equals("D"))
            {
                Money[] allocation = totalRevenue.allocate(3);
                db.insertRecognition(contractNumber, allocation[0], recognitionDate);
                db.insertRecognition(contractNumber, allocation[1], recognitionDate.addDays(30));
                db.insertRecognition(contractNumber, allocation[2], recognitionDate.addDays(60));
            }
        }
        catch (SQLException e)
        {
            throw new ApplicationException(e);
        }
    }
}
