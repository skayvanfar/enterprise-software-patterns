package CreationalPatterns.FactoryMethod.StaticFactoryMethod;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016.
 */
public class Employee {
    static Employee create(EmployeeType type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }
}
