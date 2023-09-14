package pack.lab4.shop;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Shop {

    public static class Enter {
        private String login;
        private String password;
        public String getPassword () {
            return password;
        }
        public String getLogin () {
            return login;
        }
        public Enter(String login, String password) {
            this.login = login;
            this.password = password;
        }
    }
    public static boolean Enter() {
        System.out.println("Добро пожаловать в магазин!\nЗарегистрируйтесь в системе.\nВведите логин:");
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        System.out.println("Введите пароль:");
        String password = sc.nextLine();
        Enter enter = new Enter(login, password);

        System.out.println("Войдите в систему.\nВведите логин:");
        String login_enter = sc.nextLine();
        if (!login_enter.equals(enter.getLogin())) {
            System.out.printf("Пользователь с логином '%s' не найден\n", login_enter);
            return false;
        }
        else {
            System.out.println("Введите пароль:");
            String password_enter = sc.nextLine();
            if (!password_enter.equals(enter.getPassword())) {
                for (int i = 0; i < 3; i++) {
                    if (i == 2) {
                        System.out.printf("Вы ввели неверный пароль. У вас осталось %d попытка\n", 3-i);
                    }
                    else {
                        System.out.printf("Вы ввели неверный пароль. У вас осталось %d попытки\n", 3-i);
                    }
                    password_enter = sc.nextLine();
                    if ((password_enter.equals(enter.getPassword()))) {
                        break;
                    }
                }
            }
            if (password_enter.equals(enter.getPassword())) {
                System.out.printf("Вы успешно авторизировались под логином %s\n", enter.getLogin());
                return true;
            } else {
                System.out.println("Взломщики, ухадити!!!");
                return false;
            }
        }
    }

    public static int Catalog(String num) {
        int money = 0;
        switch (num) {
            case "1", "НОУТБУКИ":
                System.out.println("Каталог ноутбуков:");
                for (Laptops laptops : Laptops.values()) {
                    System.out.printf("Ноутбук %s, цена: %d\n", laptops, laptops.getPrice());
                }
                break;
            case "2", "СМАРТФОНЫ":
                System.out.println("Каталог смартфонов:");
                for (Smartphones smartphones : Smartphones.values()) {
                    System.out.printf("Смартфон %s, цена: %d\n", smartphones, smartphones.getPrice());
                }
                break;
        }
        switch (num) {
            case "1", "НОУТБУКИ" -> money = AddLaptopToCard();
            case "2", "СМАРТФОНЫ" -> money = AddSmartphoneToCard();
            default -> System.out.println("Такого каталога нет");
        }
        return money;
    }
    public static int AddLaptopToCard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите товары для добавления в корзину. Для окончания выбора нажмите 0\n");
        ArrayList<Laptops> array = new ArrayList();
        String model = "";
        while (!model.equals("0")) {
            System.out.println("Введите название модели:");
            model = sc.nextLine().toUpperCase(Locale.ROOT);
            if (model.equals("0")) {
                break;
            }
            Laptops.valueOf(model).getDescription();
            System.out.printf("Товар %s добавлен в корзину.\n\n", model.toUpperCase());
            array.add(Laptops.valueOf(model));
        }
        System.out.println("Ваша корзина:");
        int sum = 0;
        for (Laptops element : array) {
            System.out.printf("Ноутбук %s, цена: %d\n", element, element.getPrice());
            sum = sum + element.getPrice();
        }
        System.out.printf("Сумма покупки: %d\n", sum);
        return sum;
    }
    public static int AddSmartphoneToCard() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите товары для добавления в корзину. Для окончания выбора нажмите 0\n");
        ArrayList<Smartphones> array = new ArrayList();
        String model = "";
        while (!model.equals("0")) {
            System.out.println("Введите название модели:");
            model = sc.nextLine().toUpperCase(Locale.ROOT);
            if (model.equals("0")) {
                break;
            }
            Smartphones.valueOf(model).getDescription();
            System.out.printf("Товар %s добавлен в корзину.\n\n", model.toUpperCase());
            array.add(Smartphones.valueOf(model));
        }
        System.out.println("Ваша корзина:");
        int sum = 0;
        for (Smartphones element : array) {
            System.out.printf("Смартфон %s, цена: %d\n", element, element.getPrice());
            sum = sum + element.getPrice();
        }
        System.out.printf("Сумма покупки: %d\n", sum);
        return sum;
    }
    public static void Buy(int price) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество денег для оплаты.");
        int money = sc.nextInt();
        if (money < price) {
            System.out.println("Недостаточно денег для оплаты.");
        } else {
            System.out.println("Отправляем код для оплаты!");
            int code = (int) (1000 + Math.random()*(9999-1000));
            System.out.printf("Ваш код: %s. Никому его не сообщайте!\nВведите код в строку ниже:\n", code);

            int code1 = sc.nextInt();
            if (code == code1) {
                System.out.println("Поздравляем! Покупка совершена.");
                System.out.println("Сдача: " + (money - price));
            }
            else {
                System.out.println("Покупка не совершена. Вы ввели неверный код.");
            }
        }
    }


    public static void main(String[] args) {
        if (Enter()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите каталог товаров:\n1.Ноутбуки\n2.Смартфоны");
            String num = sc.nextLine().toUpperCase();
            int money = Catalog(num);
            Buy(money);
        }
        else {
            System.out.println("Магазин закрыт. До свидания.");
        }
    }
}
enum Laptops {
    ASUS(100),
    HP(77),
    HONOR(80),
    HUAWEI(90);

    private int price;

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void getDescription() {
        switch (this) {
            case ASUS -> System.out.println("Это самый дорогой ноутбук.");
            case HP -> System.out.println("Это самый дешевый ноутбук.");
            case HONOR, HUAWEI -> System.out.println("Это стандартный ноутбук.");
        }
    }
}
enum Smartphones {
    APPLE(200),
    SAMSUNG(100),
    XIAOMI(75),
    REALME(50);

    private int price;

    private Smartphones(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void getDescription() {
        switch (this) {
            case APPLE -> System.out.println("Это самый дорогой смартфон.");
            case REALME -> System.out.println("Это самый дешевый смартфон.");
            case XIAOMI, SAMSUNG -> System.out.println("Это стандартный смартфон.");
        }
    }
}