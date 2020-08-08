package com.silver2040.auto_clicker;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
    public boolean active = true;

    public KeyInput() {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(e.isAltDown() && key == KeyEvent.VK_C){
            active = false;
            System.out.println(active);
        }
    }
}