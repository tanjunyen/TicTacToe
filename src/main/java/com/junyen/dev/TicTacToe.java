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

        int contentPaneWidth = frame.getContentPane().getWidth();
        int boxWidth = (contentPaneWidth / 3) - 50;
        int contentPaneHeight = frame.getContentPane().getHeight();
        int boxHeight = (contentPaneHeight / 3) - 50;

        int NB_OF_BOXES = 3;
        int xPosition = 10;
        int yPosition = 10;
        for (int i = 0; i < NB_OF_BOXES; i++) { //for column
            for (int y = 0; y < NB_OF_BOXES; y++) { //for row
                Rectangle rectangle = new Rectangle(xPosition, yPosition);
                frame.getContentPane().add(rectangle);
                xPosition += boxWidth + 10;
            }
            yPosition += boxHeight + 10;
        }

        frame.setVisible(true);
        frame.pack();
    }

    public void setBoardSize(int width, int height) {
        frame.setSize(width, height);
    }

    public void initializeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();
    }
}
