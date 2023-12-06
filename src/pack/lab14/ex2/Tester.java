package pack.lab14.ex2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Tester {
    public static void main(String[] args) {
        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        String pattern = "abcdefghijklmnopqrstuv18340";

        boolean isMatch1 = Pattern.matches(pattern, input1);
        boolean isMatch2 = Pattern.matches(pattern, input2);

        System.out.println("Input 1 is a match: " + isMatch1);
        System.out.println("Input 2 is a match: " + isMatch2);
    }
}