package com.junyen.dev;

import org.junit.Test;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void setGridLayout() {
        JFrame frame = new JFrame(FRAME_LABEL);
        LayoutManager gridLayout = new GridLayout(3, 3);
        JPanel panel = new JPanel();
        panel.setLayout(gridLayout);
        frame.setContentPane(panel);

        assertEquals(gridLayout, frame.getContentPane().getLayout());
    }

    @Test
    public void createGridLayoutBorder() {
        JFrame frame = new JFrame(FRAME_LABEL);
        LayoutManager gridLayout = new GridLayout(3, 3);
        JPanel panel = new JPanel();
        panel.setLayout(gridLayout);
        frame.setContentPane(panel);

        Border blackBorder = BorderFactory.createLineBorder(Color.black);
        panel.setBorder(blackBorder);

        assertEquals(blackBorder, panel.getBorder());
    }

    @Test
    public void addComponents() {
        JFrame frame = new JFrame(FRAME_LABEL);
        GridLayout gridLayout = new GridLayout(3, 3);

        JPanel panel = new JPanel();
        panel.setLayout(gridLayout);

        Rectangle rectangle = new Rectangle(5, 5);

        frame.getContentPane().add(rectangle);

        assertEquals(rectangle, frame.getContentPane().getComponent(0));
    }
}
