package DomainLogicPatterns.TransactionScript;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Table Data Gateway
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class Gateway {

    private Connection db;

    private static final String findRecognitionsStatement = "SELECT amount FROM revenueRecognitions WHERE contract = ? AND recognizedOn <=?";

    private static final String findContractStatement = "SELECT * FROM contracts c, products p WHERE c.ID = ? AND c.product = p.ID";

    private static final String insertRecognitionStatement = "INSERT INTO revenueRecognitions VALUES (?, ?, ?)";

    public ResultSet findRecognitionsFor(long contractID, MfDate asof) throws SQLException
    {
        PreparedStatement stmt = db.prepareStatement(findRecognitionsStatement);
        stmt.setLong(1, contractID);
        stmt.setDate(2, asof.toSqlDate());
        ResultSet result = stmt.executeQuery();
        return result;
    }

    public ResultSet findContract (long contractID) throws SQLException
    {
        PreparedStatement stmt = db.prepareStatement(findContractStatement);
        stmt.setLong(1, contractID);
        ResultSet result = stmt.executeQuery();
        return result;
    }

    public void insertRecognition (long contractID, Money amount, MfDate asof) throws SQLException
    {
        PreparedStatement stmt = db.prepareStatement(insertRecognitionStatement);
        stmt.setLong(1, contractID);
        stmt.setBigDecimal(2, amount.amount());
        stmt.setDate(3, asof.toSqlDate());
        stmt.executeUpdate();
    }
}
