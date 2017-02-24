package CreationalPatterns.FactoryMethod.Form3;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 2/24/2017.
 */
public class Products {

    // Factory for FirstProduct
    public Product CreateFirstProduct() {
        return new FirstProduct();
    }

    // Factory for SecondProduct
    public Product CreateSecondProduct() {
        return new SecondProduct();
    }

}
