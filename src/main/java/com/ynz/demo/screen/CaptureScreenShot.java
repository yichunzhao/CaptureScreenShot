package com.ynz.demo.screen;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Dimension -> Rectangle of screen;
 * AWT Robot to do take a shoot of a screen;
 * ImageIO to do image saving job.
 */
public class CaptureScreenShot {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            //partial screen
            Rectangle rec = new Rectangle(0, 0, 400, 400);
            BufferedImage bufferedImage = robot.createScreenCapture(rec);
            ImageIO.write(bufferedImage, "JPG", new File("C:\\Users\\zhaoy\\Downloads\\partial_screen.jpg"));

            //full screen
            Rectangle rec1 = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage fullscreen = robot.createScreenCapture(rec1);
            ImageIO.write(fullscreen, "JPG", new File("C:\\Users\\zhaoy\\Downloads\\full_screen.jpg"));

        } catch (AWTException | IOException e) {
            e.printStackTrace();
        }
    }
}
