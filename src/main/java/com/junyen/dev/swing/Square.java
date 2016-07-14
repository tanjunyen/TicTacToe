package com.junyen.dev.swing;

import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {
    private final int WIDTH = 200;
    private final int HEIGHT = 200;

    public Square() {
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.drawRect(0, 0, WIDTH, HEIGHT);
    }
}
