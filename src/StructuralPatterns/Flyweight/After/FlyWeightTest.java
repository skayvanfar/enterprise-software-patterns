package StructuralPatterns.Flyweight.After;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author <a href="kayvanfar.sj@gmail.com">Saeed Kayvanfar</a> on 9/30/2016.
 */
public class FlyWeightTest extends JFrame {

    JButton startDrawing;

    int windowWidth = 1000;
    int windowHeight = 800;

    // Create Only 16 Rect Object in Factoy
    Color[] shapeColor = {Color.orange, Color.orange, Color.red.orange, Color.yellow,
            Color.blue, Color.pink, Color.cyan, Color.magenta, Color.black, Color.gray};

    public static void main(String[] args) {
        new FlyWeightTest();
    }

    public FlyWeightTest() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FlyWeight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(e -> {
            Graphics g = drawingPanel.getGraphics();
            long startTime = System.currentTimeMillis();

            for (int i = 0; i < 100000; ++i) {
                // use factory method
                MyRect rect = RectFactory.getRect(getRandColor());
                rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
            }
            long endTime = System.currentTimeMillis();
            System.out.println("That took " + (endTime - startTime));
        });

        this.add(contentPane);
        this.setVisible(true);
    }

    private Color getRandColor() {
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(9);
        return shapeColor[randInt];
    }

    private int getRandX() {
        return (int)(Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int)(Math.random() * windowHeight);
    }
}
