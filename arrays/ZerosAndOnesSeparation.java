package arrays;

import java.util.Arrays;

public class ZerosAndOnesSeparation {

    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(array));
        separateZerosAndOnes(array);
        System.out.println(Arrays.toString(array));
    }

    public static void separateZerosAndOnes(int[] input) {
        int left = 0;                   // track leftmost position of 0s
        int right = input.length - 1;   // track rightmost position of 1s

        while (left < right) {
            while (input[left] == 0) { // move pointer to right until 1 is found
                left++;
            }

            while (input[right] == 1) { // move pointer to left until 0 is found
                right--;
            }

            if (left < right) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        }
    }
}
