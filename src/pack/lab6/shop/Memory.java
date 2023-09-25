package pack.lab6.shop;

public class Memory {
    private int capacity;
    private int speed;

    public Memory(int capacity, int speed) {
        this.capacity = capacity;
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public String toString() {
        return "Capacity: " + capacity +
                "\nSpeed: " + speed;
    }
}
