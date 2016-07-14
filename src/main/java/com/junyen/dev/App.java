package com.junyen.dev;

import com.junyen.dev.swing.GameWindow;

public class App
{
    public static void main( String[] args )
    {
        GameWindow app = new GameWindow("GameWindow");
        app.initializeFrame();
        app.initializeBoard();
    }
}
