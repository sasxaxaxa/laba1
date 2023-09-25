package pack.lab6.shop;

public class Processor {
    private String model;
    private double frequency;

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    public String getModel() {
        return model;
    }

    public double getFrequency() {
        return frequency;
    }

    public String toString() {
        return "Model: " + model +
                "\nSpeed: " + frequency;
    }
}