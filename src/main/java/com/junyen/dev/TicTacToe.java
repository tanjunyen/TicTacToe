package com.junyen.dev;


import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    private JFrame frame;
    private JPanel contentPane;

    public TicTacToe(String frameName) {
        this.frame = new JFrame(frameName);
        this.contentPane = new JPanel();
    }

    public void initializeBoard() {
        contentPane.setLayout(new GridLayout(3, 3));
        frame.setContentPane(contentPane);

        Box box = initializeBox();
        placeBoxesOnGameBoard(box);

        frame.setVisible(true);
        frame.pack();
    }

    private Box initializeBox() {
        int boxWidth = contentPane.getWidth() / 3;
        int boxHeight = contentPane.getHeight() / 3;
        Box box = new Box(boxWidth, boxHeight);
        return box;
    }

    private void placeBoxesOnGameBoard(Box box) {
        final int NB_OF_BOXES = 3;
        final int GAP = 10;
        int xPosition = GAP;
        int yPosition = GAP;

        for (int i = 0; i < NB_OF_BOXES; i++) { //for column
            for (int y = 0; y < NB_OF_BOXES; y++) { //for row
                Rectangle rectangle = new Rectangle(xPosition, yPosition);
                frame.getContentPane().add(rectangle);
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
