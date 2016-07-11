package com.junyen.dev;


import javax.swing.*;

/**
 * Created by tanjunyen on 10/07/16.
 */
public class TicTacToe {
    private JFrame frame;

    public TicTacToe(String frameName) {
        this.frame = new JFrame(frameName);
    }

    public void showBoard() {
        frame.setVisible(true);
    }

    public void setBoardSize(int width, int height) {
        frame.setSize(width, height);
    }

    public void setFullScreen() {
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
    }
}
