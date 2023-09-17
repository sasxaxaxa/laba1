package pack.lab5.Image;

import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
class Image extends JFrame{
    int WIDTH = 700;
    int HEIGHT = 500;

    Image() {
        setSize(WIDTH, HEIGHT);
        setBackground(Color.BLACK);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("src/pack/lab5/Image/1.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        g.drawImage(image, 35, 60, null);
    }

    public static void main(String[] args) {

        Image image = new Image();
    }


}
