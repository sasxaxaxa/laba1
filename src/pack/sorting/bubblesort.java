package pack.sorting;

public class bubblesort {
    public static void bubbleSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length-i-1; j++) {
                if (sortArr[j+1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j+1];
                    sortArr[j+1] = swap;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] sortArr = {9, 7, 19, 67, 55, 105, 3};
        bubbleSort(sortArr);
    }
}
