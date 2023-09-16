package pack.lab5.Soccer;



import javax.swing.*;
import java.awt.*;

public class Soccer extends JFrame {

    private JPanel panel1;
    private JButton ACMilanButton;
    private JButton realMadridButton;
    private JLabel lastScoreLabel;
    private JLabel resLabel;
    private JLabel winLabel;

    private int rea;
    private int mil;

    private Soccer() {

        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
//создали панель
        JPanel panel = new JPanel();
//задали свойство панели – цвет фона
        panel.setBackground(Color.GRAY);
// задали свойство панели размеры
        panel.setPreferredSize(new Dimension(500, 500));
        JButton ACMilanButton = new JButton("AC Milan");
        JButton realMadridButton = new JButton("Real Madrid");

        int last = 0;
        String winner = "NO";

        JLabel lastScoreLabel = new JLabel("Last Score: " + last, JLabel.CENTER);
        JLabel resLabel = new JLabel("Result: " + mil + " X " + rea, JLabel.CENTER);
        JLabel winLabel = new JLabel("Winner: " + winner, JLabel.CENTER);


        panel.add(ACMilanButton);
        panel.add(realMadridButton);
        panel.add(lastScoreLabel);
        panel.add(resLabel);
        panel.add(winLabel);


//добавили панель к фрейму
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        ACMilanButton.addActionListener(e -> {
            mil++;
            lastScoreLabel.setText("Last: AC Milian");
            resLabel.setText("Result: " + mil + " X " + rea);
            if (rea > mil)
                winLabel.setText("Winner " + "Real Madrid");
            else if (mil < rea)
                winLabel.setText("Winner " + "AC Milan");
            else
                winLabel.setText("DRAW");
        });
        realMadridButton.addActionListener(e -> {
            rea++;
            lastScoreLabel.setText("Last: Real Madrid");
            resLabel.setText("Result: " + mil + " X " + rea);
            if (rea > mil)
                winLabel.setText("Winner " + "Real Madrid");
            else if (mil < rea)
                winLabel.setText("Winner " + "AC Milan");
            else
                winLabel.setText("DRAW");

        });



    }
    public static void main(String[] args) {
        new Soccer();
    }

}