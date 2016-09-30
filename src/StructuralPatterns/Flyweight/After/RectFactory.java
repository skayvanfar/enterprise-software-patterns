package StructuralPatterns.Flyweight.After;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public class RectFactory {

    private static final Map<Color, MyRect> rectsByColor = new HashMap<>();

    /**
     * use cash
     * @param color
     * @return
     */
    public static MyRect getRect(Color color) {
        MyRect rect = rectsByColor.get(color);

        if (rect == null) {
            rect = new MyRect(color);
            rectsByColor.put(color, rect);
        }

        return rect;
    }
}
