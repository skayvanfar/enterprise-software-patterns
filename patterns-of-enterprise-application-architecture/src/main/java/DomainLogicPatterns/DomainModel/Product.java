package DomainLogicPatterns.DomainModel;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 1/20/2017.
 */
public class Product {

    private String name;

    private RecognitionStrategy recognitionStrategy;

    public Product (String name, RecognitionStrategy recognitionStrategy)
    {
        this.name = name;
        this.recognitionStrategy = recognitionStrategy;
    }

    void calculateRevenueRecognitions(Contract contract)
    {
        recognitionStrategy.calculateRevenueRecognitions(contract);
    }

    public static Product newWordProcessor(String name)
    {
        return new Product(name, new CompleteRecognitionStrategy());
    }

    public static Product newSpredsheet(String name)
    {
        return new Product(name, new ThreeWayRecognitionStrategy(60, 90));
    }

    public static Product newDatabase(String name)
    {
        return new Product(name, new ThreeWayRecognitionStrategy(30, 60));
    }
}
