package StructuralPatterns.Flyweight.Before;

import java.awt.*;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public class MyRect {

    private Color color;
    private int x, y, x2, y2;

    public MyRect(Color color, int x, int y, int x2, int y2) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, x2, y2);
    }
}
