package pack.lab4;

import java.util.ArrayList;

class Atelier {
    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда");
    }
    public static void dressMan(Clothes[] clothes) {
    }
    public static void main(String[] args) {
        ArrayList<Clothes> clothes = new ArrayList<>();

        TShirt tShirt = new TShirt("L", 120, "Black");
        Pants pants = new Pants("M", 99, "White");
        Skirt skirt = new Skirt("S", 87, "Blue");
        Tie tie = new Tie("XS", 10, "Red");

        clothes.add(tShirt);
        clothes.add(pants);
        clothes.add(skirt);
        clothes.add(tie);

        for (Clothes clothes1 : clothes) {
            clothes1.getDescription();
            System.out.printf(" размера %s, цветом %s, стоимостью: %.2f\n", clothes1.getSize(), clothes1.getColor(), clothes1.getCost());

            clothes1.dressMan();
            clothes1.dressWomen();
            System.out.println();
        }
    }

    interface MenClothing {
        void dressMan();
    }
    interface WomenClothing {
        void dressWomen();
    }
}
abstract class Clothes {
    private String size;
    private double cost;
    private String color;

    public Clothes(String size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public double getCost() {
        return cost;
    }
    public String getColor() {
        return color;
    }
    public void getDescription() {};
    public void dressMan() {};
    public void dressWomen() {};

}

// 3) Создать классы наследники класса Clothes
class TShirt extends Clothes {
    public TShirt(String size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void getDescription() {
        System.out.print("Это футболка");
    }

    public void dressMan() {
        System.out.println("Мужчина одет в футболку");
    }
    public void dressWomen() {
        System.out.println("Женщина одета в футболку");
    }
}

class Pants extends Clothes {
    public Pants(String size, double cost, String color) {
        super(size, cost, color);
    }

    public void getDescription() {
        System.out.print("Это штаны");
    }
    public void dressMan() {
        System.out.println("Мужчина одет в штаны");
    }
    public void dressWomen() {
        System.out.println("Женщина одета в штаны");
    }
}
class Skirt extends Clothes {
    public Skirt(String size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void getDescription() {
        System.out.print("Это юбка");
    }
    public void dressMan() {
        System.out.println("Мужчину нельзя одеть в юбку");
    }
    public void dressWomen() {
        System.out.println("Женщина одета в юбку");
    }
}
class Tie extends Clothes{
    public Tie(String size, double cost, String color) {
        super(size, cost, color);
    }
    @Override
    public void getDescription() {
        System.out.print("Это галстук");
    }
    public void dressMan() {
        System.out.println("Мужчина одет в галстук");
    }
    public void dressWomen() {
        System.out.println("Женщину нельзя одеть в галстук");
    }
}
