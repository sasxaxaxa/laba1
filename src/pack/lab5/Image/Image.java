package pack.lab5.Image;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Image extends JFrame {
    int WIDTH = 700;
    int HEIGHT = 500;

    private final BufferedImage bi;

    Image(String fileName) throws IOException {
        this.bi = ImageIO.read(new File(fileName));
        setSize(WIDTH, HEIGHT);
        setBackground(Color.BLACK);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        g.drawImage(bi, 35, 40, null);
    }

    public static void main(String[] args) throws IOException {
        new Image(args[0]);
    }


}
