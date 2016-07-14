package com.junyen.dev;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tanjunyen on 12/07/16.
 */
public class Rectangle extends JPanel {
    private final int x;
    private final int y;
    private final int WIDTH = 200;
    private final int HEIGHT = 200;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, WIDTH, HEIGHT);
        g.setColor(Color.blue);
        g.fillRect(5, 5, WIDTH, HEIGHT);
    }
}
