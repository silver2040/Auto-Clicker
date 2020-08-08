package com.silver2040.auto_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class ActListenerStart implements ActionListener {
    AutoClicker ac;
    Window w;
    public ActListenerStart(AutoClicker ac, Window w){
        this.ac = ac;
        this.w = w;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Timer timer = new Timer();
        ac.ButtonPressed = true;
        timer.schedule(new TimerTaskClick(ac, w), 10000);



        //while(ac.thread.)

    }

}
