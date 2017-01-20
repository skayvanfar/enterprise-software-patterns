package CreationalPatterns.AbstractFactory.ByFactoryMethod.factory;


import CreationalPatterns.AbstractFactory.ByFactoryMethod.Shape;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/28/2016
 */
public abstract class ShapeFactory {

    // Use Singleton
    private static final ShapeFactory simpleShapeFactory = new SimpleShapeFactory();
    private static final ShapeFactory robustShapeFactory = new RobustShapeFactory();

    public abstract Shape createCurvedInstance();

    public abstract Shape createStraightInstance();

    // Use Static Factory Method
    public static final ShapeFactory getFactory(ShapeFactoryType shapeFactoryType) {
        switch (shapeFactoryType) {
            case SIMPLE:
                return simpleShapeFactory;
            case ROBUST:
                return robustShapeFactory;
            default:
                throw new IllegalArgumentException("Incorrect ShapeFactoryType");
        }
    }
}
