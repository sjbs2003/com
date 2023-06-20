package com.Assignment;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnalogClockApplet extends Applet implements Runnable {
    private Thread thread;

    public void init() {
        setBackground(Color.white);
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void stop() {
        if (thread != null) {
            thread.interrupt();
            thread = null;
        }
    }

    public void run() {
        while (thread != null) {
            try {
                Thread.sleep(1000);
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void paint(Graphics g) {
        // Get current time
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String timeString = sdf.format(now);

        // Draw clock face
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = Math.min(centerX, centerY) - 10;

        g.setColor(Color.black);
        g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
        g.drawString(timeString, centerX - 25, centerY + radius + 15);

        // Draw hour hand
        int hours = now.getHours();
        int minutes = now.getMinutes();
        int hourAngle = (int) ((hours * 30) + (minutes * 0.5) - 90);
        int hourHandLength = radius / 2;

        int hourHandX = centerX + (int) (hourHandLength * Math.cos(Math.toRadians(hourAngle)));
        int hourHandY = centerY + (int) (hourHandLength * Math.sin(Math.toRadians(hourAngle)));

        g.drawLine(centerX, centerY, hourHandX, hourHandY);

        // Draw minute hand
        int minuteAngle = (int) ((minutes * 6) - 90);
        int minuteHandLength = (int) (radius * 0.7);

        int minuteHandX = centerX + (int) (minuteHandLength * Math.cos(Math.toRadians(minuteAngle)));
        int minuteHandY = centerY + (int) (minuteHandLength * Math.sin(Math.toRadians(minuteAngle)));

        g.drawLine(centerX, centerY, minuteHandX, minuteHandY);

        // Draw second hand
        int seconds = now.getSeconds();
        int secondAngle = (int) ((seconds * 6) - 90);
        int secondHandLength = (int) (radius * 0.9);

        int secondHandX = centerX + (int) (secondHandLength * Math.cos(Math.toRadians(secondAngle)));
        int secondHandY = centerY + (int) (secondHandLength * Math.sin(Math.toRadians(secondAngle)));

        g.setColor(Color.red);
        g.drawLine(centerX, centerY, secondHandX, secondHandY);
    }
}
