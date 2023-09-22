package pack.lab4.lab41.phone2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone apple = new Phone(123, "14 PRO", 181.1);
        Phone honor = new Phone(444, "X 8", 222.1);
        Phone xiaomi = new Phone(666, "Note 10", 197.4);
        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(apple);
        phones.add(honor);
        phones.add(xiaomi);

        for (Phone phone : phones) {
            System.out.printf("Телефон: %s, номер: %d, вес: %.1f\n", phone.getModel(), phone.getNumber(), phone.getWeight());
            phone.receiveCall("User");
        }

        Phone phone = new Phone(3, "Wiwa");

        System.out.printf("Телефон: %s, номер: %d\n", phone.getModel(), phone.getNumber());
        phone.receiveCall("Sasha", 77);
        System.out.println("Введите номера для рассылки");
        while (sc.hasNextInt()) {
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                phone.sendMessage(a);
            } else {
                break;
            }
        }
    }
}
