package com.junyen.dev.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Square extends JPanel {

    private char token = ' ';
    private static int turn = 0;

    public Square() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        addMouseListener(new boxMouseListener());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (token == 'X') {
            g.drawLine(10, 10, this.getWidth() - 10, this.getHeight() - 10);
            g.drawLine(this.getHeight() - 10, 10, 10, this.getHeight() - 10);
        } else if (token == 'O') {
            g.drawOval(10, 10, this.getWidth() - 20, this.getHeight() - 20);
        }
    }

    public void setToken(char token) {
        this.token = token;
    }

    private class boxMouseListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            System.out.println("Box is clicked!");
            if (turn % 2 == 0) {
                setToken('X');
            } else {
                setToken('O');
            }
            turn++;
            repaint();
        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {

        }

        public void mouseEntered(MouseEvent e) {

        }

        public void mouseExited(MouseEvent e) {

        }
    }
}
