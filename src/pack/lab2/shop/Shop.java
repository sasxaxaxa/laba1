package pack.lab2.shop;

public class Shop {
    public Shop(String computer) {
        this.computer = computer;
    }
    private String computer;
    String[] arr;

    public String[] getArr() {return arr;}
    public void setArr() {this.arr = arr;}

    public String[] add(int n, String[] arr, String x) {
        int i;
        String newarr[] = new String[n+1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];
        newarr[n] = x;
        return newarr;
    }

}
