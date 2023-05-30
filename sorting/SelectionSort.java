package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] testArray = {10, 2, 5, 4, 6, 7, 9, 1, 3, 8};
        selectionSort(testArray);

        // print sorted array
        for (int j : testArray) {
            System.out.print(" " + j);
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            // find the smallest element in unprocessed part of the array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // replace current element with the smallest
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
