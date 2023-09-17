package pack.lab6.Shop10;

import java.util.ArrayList;
import java.util.Scanner;

interface Shop {
    void print();

}

enum Computer{
    HP("Intel Core i3", 2, 3),
    ASUS("AMD Ryzen 7", 4, 5),
    HONOR("Intel i7", 7, 8);

    private String Processor;
    private int Memory;
    private int Monitor;

    Computer(String processor, int memory, int monitor) {
        Processor = processor;
        Memory = memory;
        Monitor = monitor;
    }
    public int getMemory() {
        return Memory;
    }
    public int getMonitor() {
        return Monitor;
    }
    public String getProcessor() {
        return Processor;
    }
}
