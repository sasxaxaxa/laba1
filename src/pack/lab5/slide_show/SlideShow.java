package pack.lab5.slide_show;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SlideShow {
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newSingleThreadExecutor();

    private static final class Slides {

        private final BufferedImage[] slides;
        private volatile int i = 0;

        public Slides() throws IOException {
            slides = new BufferedImage[]{
                    ImageIO.read(new File("C:\\Users\\simsa\\IdeaProjects\\laba1\\src\\pack\\lab5\\Image\\1.jpg")),
                    ImageIO.read(new File("C:\\Users\\simsa\\IdeaProjects\\laba1\\src\\pack\\lab5\\Soccer\\1.jpeg")),
                    ImageIO.read(new File("C:\\Users\\simsa\\IdeaProjects\\laba1\\src\\pack\\lab5\\Soccer\\2.jpeg"))
            };
        }

        private void draw(Graphics2D g, int width, int height) {
            g.drawImage(slides[i], 0, 0, width, height, null);
        }

        private void next() {
            i++;
            if (i >= slides.length)
                i = 0;
            System.out.println("Next: " + i);
        }
    }

    public static void main(String[] args) {
        try {
            Slides slides = new Slides();
            JFrame frame = new JFrame("Animation") {
                @Override
                public void paint(Graphics g) {
                    Graphics2D g2 = (Graphics2D) g;
                    slides.draw(g2, getWidth(), getHeight());
                }
            };
            {

                EXECUTOR_SERVICE.submit(new Runnable() {
                    @Override
                    public void run() {
                        while (true) {
                            slides.next();
                            frame.pack();
                            frame.setSize(200, 200);
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                });
            }

            frame.setBackground(Color.BLACK);
            frame.setLocation(200, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}