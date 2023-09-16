package pack.lab5;

import javax.swing.*;
import java.awt.*;
class FirstGui {
    public static void main(String args[]) {
//создаем фрейм окна с помощью конструктора
//Конструктор берет параметр – назаъвание окна – это строка
        JFrame frame = new JFrame("My First GUI");
// устанавливаем реакцию окна на закрытие по умолчанию
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//задаем свойства окна – его размеры в пискселях
        frame.setSize(300, 300);
//создаем кнопку с помощью конструктора класса JButton
//конструктор берет параметр строку – название на кнопке
        JButton button = new JButton("Press");
//добавляем кнопку ук окну
        frame.getContentPane().add(button);
//делаем окно видимым
        frame.setVisible(true);
    }
}
class SecondGui{
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button1 = new JButton("Button 1");
//сощдали еще одну кнопку
        JButton button2 = new JButton("Button 2");
        frame.getContentPane().add(button1);
//добавили вторую кнопку
        frame.getContentPane().add(button2);
        frame.setVisible(true);
    }
}
class ThirdGui {
    public static void main(String args[]) {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
//создали панель
        JPanel panel= new JPanel();
//задали свойство панели – цвет фона
        panel.setBackground(Color.GRAY);
// задали свойство панели размеры
        panel.setPreferredSize( new Dimension(200,300));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        panel.add(button1);
        panel.add(button2);
//добавили панель к фрейму
        frame.getContentPane().add(panel);
//упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}
