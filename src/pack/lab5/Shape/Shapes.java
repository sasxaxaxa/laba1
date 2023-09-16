package pack.lab5.Shape;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

class Draw extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;

    // Init
    Draw() {
        super("Random shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setBackground(Color.BLACK);
        setLocation(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    @Override
    public void paint(Graphics g2) {
        Graphics2D g = (Graphics2D) g2;
        random_shapes_paint(20, g);
    }
    void random_shapes_paint(int shapes, Graphics2D g) {


        for (int i = 0; i < shapes; i++) {
            Random rand = new Random();
            float cr = rand.nextFloat();
            float cg = rand.nextFloat();
            float cb = rand.nextFloat();
            Color randomColor = new Color(cr, cg, cb);
            g.setColor(randomColor);

            int num = (int) (1 + Math.random()*2);

            switch (num) {
                case 1:
                    g.fillRect(
                            (int) (Math.random() * WINDOW_WIDTH - 100),
                            (int) (Math.random() * WINDOW_HEIGHT - 100),
                            (int) (100 + Math.random() * 100),
                            (int) (100 + Math.random() * 100)
                    );
                    break;
                case 2:
                    g.fillOval(
                            (int) (Math.random() * WINDOW_WIDTH - 100),
                            (int) (Math.random() * WINDOW_HEIGHT - 100),
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