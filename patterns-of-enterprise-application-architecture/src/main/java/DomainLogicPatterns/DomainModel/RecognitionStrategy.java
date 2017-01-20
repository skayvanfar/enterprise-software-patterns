package DomainLogicPatterns.DomainModel;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
@FunctionalInterface
public interface RecognitionStrategy {
    void calculateRevenueRecognitions(Contract contract);
}
