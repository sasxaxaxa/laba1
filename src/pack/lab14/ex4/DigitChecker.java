package pack.lab14.ex4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.*;

public class DigitChecker {
    public static void main(String[] args) {
        String text1 = "(1 + 8) – 9 / 4";
        String text2 = "6 / 5 – 2 * 9";

        String regex = "(?<!\\+)\\d";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher1 = pattern.matcher(text1);
        System.out.println(matcher1.find() ? "Найдены цифры без плюса" : "Цифры после знака плюса присутствуют");

        Matcher matcher2 = pattern.matcher(text2);
        System.out.println(matcher2.find() ? "Найдены цифры без плюса" : "Цифры после знака плюса присутствуют");
    }
}