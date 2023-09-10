package pack.lab2.shop;

public class Shop {
    public Shop(String computer) {
        this.computer = computer;
    }

    private String computer;
    String[] arr;

    public String[] getArr() {return arr;}
    public void setArr() {this.arr = arr;}
    public void Adder(String[] arr, String x) {
        String[] new_arr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];

        }
        new_arr[new_arr.length-1] = x;
        arr = new_arr;
    }



}
