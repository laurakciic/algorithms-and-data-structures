package arrays;

import java.util.Arrays;

public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] testMatrix = {
                {1, 2, 5},
                {4, 5, 6},
                {7, 8, 9}};

        System.out.println("Main diagonal: " + Arrays.toString(searchMainDiagonal(testMatrix)));
        System.out.println("Secondary diagonal: " + Arrays.toString(searchSecondaryDiagonal(testMatrix)));
    }

    public static int[] searchMainDiagonal(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] diagonal = new int[matrix.length];

        if (rows != columns) System.out.println("Za ispis dijagonale matrica mora biti kvadratna.");

        for (int i = 0; i < columns; i++) {
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }


    /**
     *   00 01 02
     *   10 11 12
     *   20 21 22
     */
    public static int[] searchSecondaryDiagonal(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] diagonal = new int[matrix.length];

        if (rows != columns) System.out.println("Za ispis dijagonale matrica mora biti kvadratna.");

        for (int i = 0; i < rows; i++) {
            diagonal[i] = matrix[i][rows - 1 - i];
        }
        return diagonal;
    }
}
