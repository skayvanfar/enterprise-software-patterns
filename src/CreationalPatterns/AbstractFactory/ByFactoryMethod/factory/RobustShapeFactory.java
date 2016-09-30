package CreationalPatterns.AbstractFactory.ByFactoryMethod.factory;

import CreationalPatterns.AbstractFactory.ByFactoryMethod.Ellipse;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.Rectangle;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.Shape;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class RobustShapeFactory extends ShapeFactory {
    @Override
    public Shape createCurvedInstance() {
        return new Ellipse();
    }

    @Override
    public Shape createStraightInstance() {
        return new Rectangle();
    }
}
