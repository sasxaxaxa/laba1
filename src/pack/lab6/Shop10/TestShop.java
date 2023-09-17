package pack.lab6.Shop10;

import pack.lab2.shop.Shop;

public class TestShop {
    public static void main(String[] args) {
        for (Computer computer : Computer.values()) {
            computer.print();
        }
    }
}
