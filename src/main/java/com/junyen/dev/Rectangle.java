package com.junyen.dev;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tanjunyen on 12/07/16.
 */
public class Rectangle extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, 100, 100);
        g.fillRect(5, 5, 100, 100);
    }
}
