package pack.lab22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator {
    private final JTextField inputField;
    private final JLabel resultLabel;

    public Calculator() {

        JFrame frame = new JFrame("Calculator");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new FlowLayout());


        inputField = new JTextField(20);
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("Result: " + "              ");

        calculateButton.addActionListener(new CalculateButtonListener());

        frame.add(inputField);
        frame.add(calculateButton);
        frame.add(resultLabel);

        frame.pack();
        frame.setVisible(true);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = inputField.getText();
            double result = calculateRpn(input);
            resultLabel.setText("Result: " + result);
        }
    }

    private double calculateRpn(String input) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) { //ЭТО ПРОВЕРКА НА ДРОБНОЕ ЧИСЛО Я НЕ ПОНИМАЮ КАК ОНА РАБОТАЕТ
                stack.push(Double.parseDouble(token));
            } else if (token.equals("+")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 + operand2);
            } else if (token.equals("-")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 - operand2);
            } else if (token.equals("*")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 * operand2);
            } else if (token.equals("/")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 / operand2);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() // это запускает GUI в один правильный поток
                -> new Calculator());
    }
}