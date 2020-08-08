package com.silver2040.auto_clicker;

import javax.swing.*;
import java.awt.event.*;

public class ActListener implements ActionListener {
    private Window w;
    private int Ms;
    public int check = 0;
    AutoClicker ac;
    public ActListener(Window w, AutoClicker ac){
        this.w = w;
        this.ac = ac;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            Ms = Integer.parseInt(w.MsDelay.getText());
            ac.delay = Ms;
            check++;
            System.out.println(Ms);
        }catch(Exception en){
            en.printStackTrace();
            JOptionPane.showConfirmDialog(w, "Please Enter a Numerical Value","Error",-1);

        }
    }
}
