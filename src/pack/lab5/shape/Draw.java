package pack.lab5.shape;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

class Draw extends JFrame {
    private static final int WINDOW_WIDTH = 1024;
    private static final int WINDOW_HEIGHT = 768;

    private final BufferedImage bufferedImage;

    Draw() {
        super("Random shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setBackground(Color.BLACK);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bufferedImage = bufferedShapes(20, WINDOW_WIDTH, WINDOW_HEIGHT);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        g.drawImage(bufferedImage, 0, 0, getWidth(), getHeight(),
                (img, infoflags, x, y, width, height) -> false);
    }

    private static BufferedImage bufferedShapes(int shapes, int width, int height) {
        BufferedImage b = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = b.createGraphics();
        random_shapes_paint(shapes, g, width, height);
        return b;
    }

    private static void random_shapes_paint(int shapes, Graphics2D g, int width, int height) {
        for (int i = 0; i < shapes; i++) {
            Random rand = new Random();
            float cr = rand.nextFloat();
            float cg = rand.nextFloat();
            float cb = rand.nextFloat();
            Color randomColor = new Color(cr, cg, cb);
            g.setColor(randomColor);
            int num = (int) (1 + Math.random() * 2);
            switch (num) {
                case 1:
                    g.fillRect(
                            (int) (Math.random() * width - 100),
                            (int) (Math.random() * height - 100),
                            (int) (100 + Math.random() * 100),
                            (int) (100 + Math.random() * 100)
                    );
                    break;
                case 2:
                    g.fillOval(
                            (int) (Math.random() * width - 100),
                            (int) (Math.random() * height - 100),
                            (int) (100 + Math.random() * 100),
                            (int) (100 + Math.random() * 100)
                    );
            }
        }
    }

    public static void main(String[] args) {
        Draw draw = new Draw();
    }
}