package CreationalPatterns.AbstractFactory.ByFactoryMethod;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public abstract class Shape {

    protected int id;

    protected static int total = 0;

    Shape() {
        id = total++;
    }

    abstract void draw();
}
