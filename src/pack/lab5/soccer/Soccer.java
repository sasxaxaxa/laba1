package pack.lab5.soccer;


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
        JButton btnMilan = new JButton("AC Milan");
        JButton btnMadrid = new JButton("Real Madrid");

        int last = 0;
        String winner = "NO";

        JLabel lblScore = new JLabel("Last Score: " + last, JLabel.CENTER);
        JLabel lblResult = new JLabel("Result: " + mil + " X " + rea, JLabel.CENTER);
        JLabel lblWinner = new JLabel("Winner: " + winner, JLabel.CENTER);


        panel.add(btnMilan);
        panel.add(btnMadrid);
        panel.add(lblScore);
        panel.add(lblResult);
        panel.add(lblWinner);

//добавили панель к фрейму
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        btnMilan.addActionListener(e -> {
            mil++;
            lblScore.setText("Last: AC Milian");
            madrid(lblResult, lblWinner);
        });
        btnMadrid.addActionListener(e -> {
            rea++;
            lblScore.setText("Last: Real Madrid");
            madrid(lblResult, lblWinner);
        });
    }

    private void madrid(JLabel resLabel, JLabel winLabel) {
        resLabel.setText("Result: " + mil + " X " + rea);
        if (rea > mil) {
            winLabel.setText("Winner " + "Real Madrid");
        } else if (mil < rea) {
            winLabel.setText("Winner " + "AC Milan");
        } else {
            winLabel.setText("DRAW");
        }
    }

    public static void main(String[] args) {
        new Soccer();
    }

}