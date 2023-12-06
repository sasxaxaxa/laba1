package pack.lab24.example.ex2;

import pack.lab24.example.ex1.Computer;
import pack.lab24.example.ex1.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private final String ram;
    private final String hdd;
    private final String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}
