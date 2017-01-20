package CreationalPatterns.AbstractFactory.ByFactoryMethod;

import CreationalPatterns.AbstractFactory.ByFactoryMethod.factory.ShapeFactory;
import CreationalPatterns.AbstractFactory.ByFactoryMethod.factory.SimpleShapeFactory;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public class Main {

    public static void main(String[] args) {
        ShapeFactory simpleShapeFactory = new SimpleShapeFactory();
      //  ShapeFactory robustShapeFactory = new RobustShapeFactory();

        Shape [] shapes = new Shape[3];

        shapes[0] = simpleShapeFactory.createCurvedInstance();
        shapes[1] = simpleShapeFactory.createStraightInstance();
        shapes[2] = simpleShapeFactory.createCurvedInstance();

        for (Shape shape : shapes)
            shape.draw();
    }
}
