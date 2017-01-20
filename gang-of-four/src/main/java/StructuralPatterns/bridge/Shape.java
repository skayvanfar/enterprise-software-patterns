package StructuralPatterns.bridge;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
public abstract class Shape {

    //Composition - implementor
    protected Color color;

    // constructor with implementor as input argument
    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
