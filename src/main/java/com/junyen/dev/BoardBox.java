package com.junyen.dev;

public class BoardBox {
    private final int width;
    private final int height;

    public BoardBox() {
        this.width = 10;
        this.height = 10;
    }

    public BoardBox(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
