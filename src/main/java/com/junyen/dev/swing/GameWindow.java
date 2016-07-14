package com.junyen.dev.swing;

import com.junyen.dev.BoardBox;

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

        BoardBox box = initializeBox();
        placeBoxesOnGameBoard(box);

        frame.setVisible(true);
        frame.pack();
    }

    private BoardBox initializeBox() {
        int boxWidth = contentPane.getWidth() / 3;
        int boxHeight = contentPane.getHeight() / 3;
        BoardBox box = new BoardBox(boxWidth, boxHeight);
        return box;
    }

    private void placeBoxesOnGameBoard(BoardBox box) {
        final int NB_OF_BOXES = 3;
        final int GAP = 10;
        int xPosition = GAP;
        int yPosition = GAP;

        for (int i = 0; i < NB_OF_BOXES; i++) { //for column
            for (int y = 0; y < NB_OF_BOXES; y++) { //for row
                Square square = new Square(xPosition, yPosition);
                frame.getContentPane().add(square);
                xPosition += box.getWidth() + GAP;
            }
            yPosition += box.getHeight() + GAP;
        }
    }

    public void initializeFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setMaximumSize(new Dimension(600, 600));
        frame.pack();
    }
}
