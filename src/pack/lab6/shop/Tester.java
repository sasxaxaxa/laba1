package pack.lab6.shop;


import java.util.ArrayList;


public class Tester implements InputInterface {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList<>();
        InputInterface in = new Tester();

        Computer computer1 = new Computer(Brand.HONOR,
                new Processor("AMD Ryzen", 3.4),
                new Memory(512, 3000),
                new Monitor("honormonitor", 16));

        Computer computer2 = new Computer(Brand.HP,
                new Processor("Intel i5", 3.2),
                new Memory(256, 3300),
                new Monitor("gigabyte", 20));
        Computer computer3 = new Computer(Brand.HP,
                new Processor("Intel i7", 3.44),
                new Memory(1024, 3200),
                new Monitor("logitec", 25));
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        for (Computer computer : computers) {
            System.out.println(computer.toString());
        }


    }
}

// для ввода с клавиатуры:
//        int num = in.getIntInput("Введите количество компьютеров:");
//        for (int i = 0; i < num; i++) {
//            Brand brand = Brand.valueOf(in.getStringInput("Введите название компьютера:"));
//            String model = in.getStringInput("Введите название процессора:");
//            double frequency = in.getDoubleInput("Введите частоту процессора:");
//            int capacity = in.getIntInput("Введите количество памяти:");
//            int speed = in.getIntInput("Введите скорость памяти:");
//            String name = in.getStringInput("Введите название монитора:");
//            double size = in.getDoubleInput("Введите размер монитора:");
//            Computer computer = new Computer(brand,
//                    new Processor(model, frequency),
//                    new Memory(capacity, speed),
//                    new Monitor(name, size));
//            computers.add(computer);
//        }