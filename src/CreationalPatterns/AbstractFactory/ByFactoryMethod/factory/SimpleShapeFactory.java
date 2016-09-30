package CreationalPatterns.AbstractFactory.ByFactoryMethod.factory;

import CreationalPatterns.AbstractFactory.ByFactoryMethod.Circle;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.Shape;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.Square;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class SimpleShapeFactory extends ShapeFactory {
    @Override
    public Shape createCurvedInstance() {
        return new Circle();
    }

    @Override
    public Shape createStraightInstance() {
        return new Square();
    }
}
