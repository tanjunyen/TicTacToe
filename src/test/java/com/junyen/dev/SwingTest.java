package com.junyen.dev;

import org.junit.Test;
import javax.swing.*;

import java.awt.*;

import static org.junit.Assert.*;

public class SwingTest {

    public static final String FRAME_LABEL = "FrameLabel";

    @Test
    public void createVisibleFrame() {
        JFrame frame = new JFrame(FRAME_LABEL);
        frame.setVisible(true);
        assertEquals(true, frame.isVisible());
    }

    @Test
    public void setFrameSize() {
        JFrame frame = new JFrame(FRAME_LABEL);
        int widthInPixel = 100;
        int heightInPixel = 100;
        frame.setSize(widthInPixel, heightInPixel);
        assertEquals(100, frame.getWidth());
        assertEquals(100, frame.getHeight());
    }

    @Test
    public void setFullScreen() {
        JFrame frame = new JFrame(FRAME_LABEL);
        frame.setExtendedState(frame.MAXIMIZED_BOTH);
        assertEquals(frame.MAXIMIZED_BOTH, frame.getState());
    }
}
