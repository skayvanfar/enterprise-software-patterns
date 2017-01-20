package StructuralPatterns.Flyweight.After;

import java.awt.*;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public class MyRect {

    private Color color;
    private int x, y, x2, y2;

    public MyRect(Color color) {
        this.color = color;
    }

    public void draw(Graphics g, int x, int y, int x2, int y2) {
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }
}
