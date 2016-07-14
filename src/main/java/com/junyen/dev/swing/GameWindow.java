package com.junyen.dev.swing;

import javax.swing.*;
import java.awt.*;

public class GameWindow {
    private JFrame frame;
    private JPanel contentPane;

    public GameWindow(String frameName) {
        this.frame = new JFrame(frameName);
        this.contentPane = new JPanel();
    }

    public void initializeBoard() {
        contentPane.setLayout(new GridLayout(3, 3));
        frame.setContentPane(contentPane);

        placeBoxesOnGameBoard();

        frame.setVisible(true);
        frame.pack();
    }

    private void placeBoxesOnGameBoard() {
        final int NB_OF_BOXES = 3;
        for (int i = 0; i < NB_OF_BOXES; i++) { //for column
            for (int y = 0; y < NB_OF_BOXES; y++) { //for row
                final Square square = new Square();
                frame.getContentPane().add(square);
            }
        }
    }

    public void initializeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setMaximumSize(new Dimension(600, 600));
        frame.pack();
    }

}
