package pack.lab25.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PriceExtractor {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 0.004 EU";
        String regex = "\\b\\d+(?:\\.\\d+)?\\s(?:USD|RUВ|EU)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}