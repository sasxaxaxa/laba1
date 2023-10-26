package pack.lab4.lab41.furniture9;

public class Furniture {
    private final String type;
    private final double x;
    private final double y;
    private final double z;

    public Furniture(String type, double x, double y, double z) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getType() {
        return type;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getZ() {
        return z;
    }

    public double getBox() {
        return x * y * z;
    }
}


class Table extends Furniture {
    protected double x;
    protected double y;
    protected double z;

    public Table(double x, double y, double z) {
        super("Стол", x, y, z);
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Bed extends Furniture {
    protected double x;
    protected double y;
    protected double z;

    public Bed(double x, double y, double z) {
        super("Кровать", x, y, z);
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Chair extends Furniture {
    protected double x;
    protected double y;
    protected double z;

    public Chair(double x, double y, double z) {
        super("Стул", x, y, z);
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Closet extends Furniture {
    protected double x;
    protected double y;
    protected double z;

    public Closet(double x, double y, double z) {
        super("Шкаф", x, y, z);
        this.x = x;
        this.y = y;
        this.z = z;
    }
}