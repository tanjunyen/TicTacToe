package com.junyen.dev.swing;

import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {
    private final int x;
    private final int y;
    private final int WIDTH = 200;
    private final int HEIGHT = 200;

    public Square(int x, int y) {
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
