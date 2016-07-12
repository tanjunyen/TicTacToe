package com.junyen.dev;


import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    private JFrame frame;

    public TicTacToe(String frameName) {
        this.frame = new JFrame(frameName);
    }

    public void initializeBoard() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));

        frame.setContentPane(panel);

        Rectangle rectangle = new Rectangle();
        frame.getContentPane().add(rectangle);

        frame.setVisible(true);
        frame.pack();
    }

    public void setBoardSize(int width, int height) {
        frame.setSize(width, height);
    }

    public void setFullScreen() {
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
    }
}
