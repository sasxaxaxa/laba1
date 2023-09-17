package pack.lab5.SlideShow;
import javax.swing.*;
import java.net.*;
public class SlideShow {
    public static void main(String[] args){
        try {
            Icon imageIcon = new ImageIcon("src/pack/lab5/SlideShow/cat-typing.gif");
            JLabel label = new JLabel(imageIcon);
            JFrame frame = new JFrame("Animation");
            frame.getContentPane().add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}