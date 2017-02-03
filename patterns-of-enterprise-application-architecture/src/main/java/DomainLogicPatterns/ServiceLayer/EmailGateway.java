package DomainLogicPatterns.ServiceLayer;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 2/3/2017.
 */
public interface EmailGateway {
    void sendEmailMessage(String toAddress, String subject, String body);
}
