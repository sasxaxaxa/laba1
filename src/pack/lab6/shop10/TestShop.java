package pack.lab6.shop10;

public class TestShop {
    public static void main(String[] args) {
        for (Computer computer : Computer.values()) {
            computer.print();
        }
    }
}
