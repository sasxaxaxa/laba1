package pack.lab4.lab41.transport;

abstract class Transport {
    protected double price;
    protected double speed;
    protected double distance;

    public Transport(double price, double speed, double distance) {
        this.price = price;
        this.speed = speed;
        this.distance = distance;
    }

    public double getCost() {
        return distance * price;
    }

    public double getTime() {
        return distance / speed;
    }
}

class Car extends Transport {
    public Car(double price, double speed, double distance) {
        super(price, speed, distance);
        this.price = 10;
        this.speed = 80;
    }

    @Override
    public double getTime() {
        return super.getTime();
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
}

class Plane extends Transport {
    public Plane(double price, double speed, double distance) {
        super(price, speed, distance);
        this.price = 200;
        this.speed = 500;

    }

    @Override
    public double getTime() {
        return super.getTime();
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
}

class Train extends Transport {
    public Train(double price, double speed, double distance) {
        super(price, speed, distance);
        this.price = 100;
        this.speed = 150;

    }

    @Override
    public double getTime() {
        return super.getTime();
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
}

class Ship extends Transport {
    public Ship(double price, double speed, double distance) {
        super(price, speed, distance);
        this.price = 50;
        this.speed = 100;
    }

    @Override
    public double getTime() {
        return super.getTime();
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
}
