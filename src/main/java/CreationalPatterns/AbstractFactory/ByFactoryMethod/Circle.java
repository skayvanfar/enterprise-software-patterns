package CreationalPatterns.AbstractFactory.ByFactoryMethod;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("draw in Circle id: " + id);
    }
}
