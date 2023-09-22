package pack.lab4.lab41.phone2;

public class Phone {
    public int number;
    public String model;
    public double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public void receiveCall(String name, int number) {
        System.out.printf("Звонит %s с номера %d\n", name, number);
    }


    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void sendMessage(int number) {
        System.out.printf("Сообщение отправлено номеру: %d\n", number);
    }
}
