package pack.lab13;

public class StringOperations {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        // Task 2: Print the last character of the string
        char lastChar = getLastCharacter(inputString);
        System.out.println("Last character: " + lastChar);

        // Task 3: Check if the string ends with "!!!"
        boolean endsWithExclamation = checkEndsWithExclamation(inputString);
        System.out.println("Ends with '!!!': " + endsWithExclamation);

        // Task 4: Check if the string starts with "I like"
        boolean startsWithILike = checkStartsWithILike(inputString);
        System.out.println("Starts with 'I like': " + startsWithILike);
    }

    // Method to get the last character of a string
    public static char getLastCharacter(String str) {
        return str.charAt(str.length() - 1);
    }

    // Method to check if a string ends with "!!!"
    public static boolean checkEndsWithExclamation(String str) {
        return str.endsWith("!!!");
    }

    // Method to check if a string starts with "I like"
    public static boolean checkStartsWithILike(String str) {
        return str.startsWith("I like");
    }
}