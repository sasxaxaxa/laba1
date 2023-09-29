package pack.lab7.stroki_56;


public class Tester {
    public static void main(String[] args) {
        Stroka stroki = new ProcessStrings();

        String s = "AaBbCcDd112233";

        System.out.printf("Длина строки '%s': %d\n", s, stroki.lenStr(s));

        System.out.printf("Строка '%s' из нечетных символов: '%s'\n", s, stroki.StrNechet(s));

        System.out.printf("Строка '%s' из четных символов: '%s'\n", s, stroki.StrChet(s));

        System.out.printf("Строка '%s' перевернутая: '%s'\n", s, stroki.ReverseStr(s));

    }
}