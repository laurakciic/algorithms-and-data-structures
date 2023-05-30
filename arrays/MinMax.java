package arrays;

public class MinMax {

    public static void main(String[] args) {
        int[] testArray = {5, 1, 3, 4, 2};
        findMinMax(testArray);
    }

    public static void findMinMax(int[] array) {
        if (array.length == 0) {
            System.out.println("Empty array.");
            return;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
