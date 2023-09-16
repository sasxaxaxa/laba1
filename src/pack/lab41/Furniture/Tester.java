package pack.lab41.Furniture;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Bed bed = new Bed(2, 2, 0.5);
        Chair chair = new Chair(0.7, 0.5, 1);
        Closet closet = new Closet(4.5, 3, 3);
        Closet closet1 = new Closet(1, 1, 1);
        Table table = new Table(2.5, 2.7, 0.9);

        ArrayList<Furniture> shop = new ArrayList<>();

        shop.add(bed);
        shop.add(chair);
        shop.add(closet);
        shop.add(closet1);
        shop.add(table);

        for (Furniture furniture : shop) {
            System.out.printf("%s, габариты: %.1fm x %.1fm x %.1fm\nОбъем: %.2f\n", furniture.getType(), furniture.getX(), furniture.getY(), furniture.getZ(), furniture.getBox());
        }
    }
}
