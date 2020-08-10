package com.silver2040.auto_clicker;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferStrategy;

public class AutoClicker extends Canvas implements Runnable {
    private Robot robot;
    public int delay = 200;
    private Boolean running = false;
    Thread thread = new Thread();
    public static Boolean ButtonPressed = false;


    public AutoClicker(){
        try{
            robot = new Robot();

        }catch(Exception e){
            e.printStackTrace();
        }

        Window window = new Window(500, 500/12*9, "AutoClicker", this);

        this.addKeyListener(new KeyInput(this));
        start();
        run();
        //this.addMouseListener(new MouseListener());



    }
    public void leftClick(int button){
        try {
            robot.mousePress(button);
            robot.delay(2);
            robot.mouseRelease(button);
            robot.delay(delay);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void render(){

     /*   BufferStrategy bs = this.getBufferStrategy();

        if (bs == null) {
            this.createBufferStrategy(1);
            return;
        }*/


        Graphics g = this.getGraphics();
        g.setColor(Color.WHITE);
        g.setFont(Font.getFont(Font.SANS_SERIF));
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);
        g.drawString("Ms Delay",120,125);

        g.drawString("ALT + C will stop the clicker", 150, 250);

        g.drawString("AutoClicker will begin 10s after clicking start", 130, 300);


        Font currentFont = g.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.7F);
        g.setFont(newFont);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);
        g.drawString("AutoClicker", 180,50);



        // g.drawString("HdsfVidcksd", 180,50);
        //g.drawString("JndsJdhsdef", 180,50);
        g.setColor(Color.CYAN);
        Gpaint(g);
       /*g.drawRect(180,175,100,30);
       g.drawString("Start",205,198);
       g.drawRect(1,1,480, 440/12*9);
        g.drawRect(2,2,480, 440/12*9);
        g.drawRect(3,3,480, 440/12*9);
        g.drawRect(4,4,480, 440/12*9);
        g.drawRect(5,5,480, 440/12*9);
        g.drawRect(6,6,480, 440/12*9);
        g.drawRect(178,30, 113, 30);*/
    }
    public void Gpaint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        //Color startColor = new Color(120,0,120);
        Color startColor = Color.CYAN;
        Color endColor = Color.black;

        int startX = 300, startY = 400, endX = 100, endY = 190;

        GradientPaint gradient = new GradientPaint(startX, startY, startColor, endX, endY, endColor);
        g2d.setPaint(gradient);

        g2d.fill(new Rectangle(0,0,500,490/12*9));
    }

    public synchronized void start(){
        thread.start();
        running = true;

    }
    public synchronized void stop(){
        try {
            thread.join();
            running = false;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }


    public void run() {

        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (running) {
                render();

            }
            frames++;
            if (System.currentTimeMillis() - timer > 100) {
                timer += 1000;
                System.out.println("FPS "+ frames);
                frames = 0;
            }
        }
        stop();
    }
    public void tick(){

    }
}

