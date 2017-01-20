package StructuralPatterns.bridge;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/29/2016.
 */
public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("green.");
    }
}
