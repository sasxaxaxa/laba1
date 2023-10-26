package pack.lab3.sequence_3;

public class Sequence {
    public static void main(String[] args) {
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            int x = (int) (10 + Math.random() * (99 - 10));
            array[i] = x;
            System.out.print(x + " ");
        }
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                flag = false;
                break;
            }
        }
        System.out.println();
        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }


}
