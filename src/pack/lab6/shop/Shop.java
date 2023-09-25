package pack.lab6.shop;

import java.util.ArrayList;

enum Brand {
    HP, HONOR, HUAWEI, DELL, ASUS, LENOVO, ACER
}

public class Shop {
    private ArrayList<Computer> computers;

    public Shop(ArrayList<Computer> computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(Brand brand) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                return computer;
            }
        }
        return null;
    }
}