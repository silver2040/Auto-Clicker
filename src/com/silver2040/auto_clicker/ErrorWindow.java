package com.silver2040.auto_clicker;

import javax.swing.*;
import java.awt.*;

public class ErrorWindow extends Canvas{
    JFrame frame;
    public ErrorWindow(int width, int height, String Title) {
        frame = new JFrame(Title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }
}
