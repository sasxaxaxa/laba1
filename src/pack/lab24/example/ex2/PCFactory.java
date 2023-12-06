package pack.lab24.example.ex2;

import pack.lab24.example.ex1.Computer;
import pack.lab24.example.ex1.PC;

public class PCFactory implements ComputerAbstractFactory {
    private final String ram;
    private final String hdd;
    private final String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
