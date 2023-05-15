public class BinarySearch {
    public static void main(String[] args) {
        // elements must be sorted
        int[] testArray = {1, 2, 3, 4, 5, 6, 10, 23, 32, 33, 34, 35, 36, 37};
        int target = 36;
        int foundElement = binarySearch(testArray, target);
        System.out.println("Element " + foundElement + " found.");
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                return target;
            } else if (array[mid] < target) {
                left = mid + 1;                 // target je u desnoj polovici
            } else {
                right = mid - 1;                // target je u lijevoj polovici
            }
        }
        return -1;
    }
}
