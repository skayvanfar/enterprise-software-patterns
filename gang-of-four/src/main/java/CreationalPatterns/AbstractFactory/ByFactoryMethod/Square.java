package CreationalPatterns.AbstractFactory.ByFactoryMethod;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("draw in Square id: " + id);

    }
}
