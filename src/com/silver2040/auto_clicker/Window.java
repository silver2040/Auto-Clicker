package com.silver2040.auto_clicker;

import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {
    private int Ms;
    JButton Set = new JButton("Set Ms");
    JTextField MsDelay = new JTextField();
    ImageIcon icon = new ImageIcon("image/gear.png");
    JFrame frame;
    JButton Start;
        public Window(int width, int height, String Title, AutoClicker ac) {
            ActListener al = new ActListener(this, ac);
            frame = new JFrame(Title);
            frame.setPreferredSize(new Dimension(width, height));
            frame.setMaximumSize(new Dimension(width, height));
            frame.setMinimumSize(new Dimension(width, height));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setIconImage(icon.getImage());
            MsDelay.setBounds(240,110,100,25);
            MsDelay.setFont(Font.getFont(Font.MONOSPACED));
            Set.setBounds(100,175,100,20);
            Set.setFont(Font.getFont(Font.SANS_SERIF));
            Set.addActionListener(al);
            Start = new JButton("Start");
            Start.addActionListener(new ActListenerStart(ac, this, al));
            Start.setBounds(250,175,100,20);
            Start.setFont(Font.getFont(Font.SANS_SERIF));
            frame.add(Start);
            frame.add(Set);
            frame.add(MsDelay);
            frame.add(ac);
            frame.setVisible(true);




        }


}

