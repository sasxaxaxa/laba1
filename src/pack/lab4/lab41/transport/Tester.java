package pack.lab4.lab41.transport;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Car car1 = new Car(0, 0, 100);
        Plane plane1 = new Plane(0, 0, 2000);
        Train train1 = new Train(0, 0, 1000);
        Ship ship1 = new Ship(0, 0, 250);

        ArrayList<Transport> transports = new ArrayList<>();

        transports.add(car1);
        transports.add(plane1);
        transports.add(train1);
        transports.add(ship1);

        for (Transport transport : transports) {
            System.out.printf("Время перевозки: %.2f ч.\n", transport.getTime());
            System.out.printf("Стоимость перевозки: %.2f\n", transport.getCost());

        }

    }
}
