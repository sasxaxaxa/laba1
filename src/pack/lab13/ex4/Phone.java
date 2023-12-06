package pack.lab13.ex4;

public class Phone {
    private final String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String format() {
        String cleanedNumber = phoneNumber.replaceAll("[^0-9]", "");

        if (cleanedNumber.startsWith("+")) {
            return formatInternationalNumber(cleanedNumber);
        } else if (cleanedNumber.startsWith("8") && cleanedNumber.length() == 11) {
            return formatRussianNumber(cleanedNumber);
        } else {
            return "Неверный формат номера";
        }
    }

    private String formatInternationalNumber(String number) {
        String countryCode = number.substring(1, 4);
        String firstThreeDigits = number.substring(4, 7);
        String nextThreeDigits = number.substring(7, 10);
        String lastFourDigits = number.substring(10);
        return "+" + countryCode + "-" + firstThreeDigits + "-" + nextThreeDigits + "-" + lastFourDigits;
    }

    private String formatRussianNumber(String number) {
        String firstThreeDigits = number.substring(1, 4);
        String nextThreeDigits = number.substring(4, 7);
        String lastFourDigits = number.substring(7);
        return "+7-" + firstThreeDigits + "-" + nextThreeDigits + "-" + lastFourDigits;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("+1212");
        System.out.println(phone1.format());

        Phone phone2 = new Phone("+104289652211");
        System.out.println(phone2.format());

        Phone phone3 = new Phone("89175655655");
        System.out.println(phone3.format());
    }
}