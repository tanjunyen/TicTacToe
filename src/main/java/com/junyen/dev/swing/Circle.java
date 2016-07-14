package com.junyen.dev.swing;

import javax.swing.*;
import java.awt.*;

public class Circle extends JComponent{
    private final Point center;
    private final int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = (int) center.getX();
        int y = (int) center.getY();
        int diameter = radius * 2;
        g.setColor(Color.red);
        g.fillOval(x, y, diameter, diameter);
        g.drawOval(x, y, diameter, diameter);
    }
}
