package pack.lab24.example.ex2;

import pack.lab24.example.ex1.Computer;

public class TestDesignPatterns {
    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }

    public static void main(String[] args) {
        testAbstractFactory();
    }
}
