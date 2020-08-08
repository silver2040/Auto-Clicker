package com.silver2040.auto_clicker;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
    public boolean active = true;
    AutoClicker ac;
    public KeyInput(AutoClicker ac) {
        this.ac = ac;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(e.isAltDown() && key == KeyEvent.VK_C){
            ac.ButtonPressed = false;
            System.out.println(ac.ButtonPressed);
        }
    }
}