package com.silver2040.auto_clicker;

import java.awt.event.InputEvent;
import java.util.TimerTask;

public class TimerTaskClick extends TimerTask {
    AutoClicker ac;
    Window w;
    public TimerTaskClick(AutoClicker ac, Window w){
        this.ac = ac;
        this.w = w;
    }
    @Override
    public void run() {
        while(ac.ButtonPressed){
            ac.leftClick(InputEvent.BUTTON1_DOWN_MASK);
            if(ac.ButtonPressed == false){
                break;
            }
        }
    }
}
