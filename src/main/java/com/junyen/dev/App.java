package com.junyen.dev;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TicTacToe app = new TicTacToe("TicTacToe");
        app.initializeFrame();
        app.initializeBoard();
    }
}
