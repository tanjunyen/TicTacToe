package com.junyen.dev;

import com.junyen.dev.swing.GameWindow;

import javax.swing.*;

public class App
{
    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GameWindow app = new GameWindow("GameWindow");
                app.initializeFrame();
                app.initializeBoard();
            }
        });
    }
}
