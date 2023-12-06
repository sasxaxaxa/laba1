package pack.lab13.ex1;

public class StringOperations {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        char lastChar = getLastCharacter(inputString);
        System.out.println("Last character: " + lastChar);

        boolean endsWithExclamation = checkEndsWithExclamation(inputString);
        System.out.println("Ends with '!!!': " + endsWithExclamation);

        boolean startsWithILike = checkStartsWithILike(inputString);
        System.out.println("Starts with 'I like': " + startsWithILike);

        boolean containsSubstring = containsSubstring(inputString);
        System.out.println("Contains Java: " + containsSubstring);

        int position = position(inputString);
        System.out.println("Position of Java: " + position);

        String replacedStr = replacedStr(inputString);
        System.out.println("Replaced: " + replacedStr);

        String upperCaseStr = upperCaseStr(inputString);
        System.out.println("UpperCase: " + upperCaseStr);

        String lowerCaseStr = lowerCaseStr(inputString);
        System.out.println("LowerCase: " + lowerCaseStr);

        String subString = subString(inputString);
        System.out.println("Substring: " + subString);
    }

    public static char getLastCharacter(String str) {
        return str.charAt(str.length() - 1);
    }

    public static boolean checkEndsWithExclamation(String str) {
        return str.endsWith("!!!");
    }

    public static boolean checkStartsWithILike(String str) {
        return str.startsWith("I like");
    }

    public static boolean containsSubstring(String str) {
        return str.contains("Java");
    }

    public static int position(String str) {
        return str.indexOf("Java");
    }

    public static String replacedStr(String str) {
        return str.replace("a", "o");
    }

    public static String upperCaseStr(String str) {
        return str.toUpperCase();
    }

    public static String lowerCaseStr(String str) {
        return str.toLowerCase();
    }

    public static String subString(String str) {
        return str.substring(7, 11);
    }
}