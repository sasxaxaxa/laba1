package pack.lab24.example.ex2;

import pack.lab24.example.ex1.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
