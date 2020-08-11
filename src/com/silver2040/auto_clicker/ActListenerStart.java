package com.silver2040.auto_clicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class ActListenerStart implements ActionListener {
    AutoClicker ac;
    Window w;
    ActListener al;
    public ActListenerStart(AutoClicker ac, Window w, ActListener al){
        this.ac = ac;
        this.w = w;
        this.al = al;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(al.Ms <= 60000) {
            Timer timer = new Timer();
            ac.ButtonPressed = true;
            timer.schedule(new TimerTaskClick(ac, w), 10000);
        }
        else{
            JOptionPane.showConfirmDialog(w, "Please Enter a Numerical Value less than 60,000","Error",-1);
        }


        //while(ac.thread.)

    }

}
