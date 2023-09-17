package pack.lab6.Convertable;

interface Convertable {
    void convert();
}

class toCels implements Convertable{
    private Double kel;

    public toCels(Double kel) {
        this.kel = kel;
    }

    @Override
    public void convert() {
        System.out.printf("%.2f Кельвинов = %.2f градусов Цельсия\n", kel, kel-273.15);
    }
}

class toKel implements Convertable{
    private Double cels;
    public toKel(Double cels) {
        this.cels = cels;
    }

    @Override
    public void convert() {
        System.out.printf("%.2f градусов Цельсия = %.2f Кельвинов\n", cels, cels+273.15);
    }
}

