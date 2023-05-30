package arrays;

public class ArithmeticMean {
    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        System.out.println("Aritmeticka sredina: " + calculateArithmeticMean(testArray));
    }

    public static double calculateArithmeticMean(int[] array) {
        if (array.length == 0) System.out.println("Empty array.");

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum/2;
    }
}
