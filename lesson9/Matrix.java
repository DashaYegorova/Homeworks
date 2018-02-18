package lesson9;

import java.util.Arrays;

public class Matrix {
    int strings, columns;
    int[][] array = new int[strings][columns];


    Matrix(int strings, int columns) {
        this.strings = strings;
        this.columns = columns;

    }


    Matrix print() {
        Matrix o = new Matrix(strings, columns);
        int i, j, k = 0;
        for (i = 0; i < strings; i++) {
            for (j = 0; j < columns; j++) {
                array[i][j] = k++;
            }
        }
        System.out.println(Arrays.deepToString(array));
        return o;
    }


    Matrix plus(int[][] matrix, int[][] matrix1, int[][] matrix2) {
        Matrix o = new Matrix(strings, columns);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return o;
    }

    Matrix multiple(int[][] matrix, int[][] matrix1, int num) {
        Matrix o = new Matrix(strings, columns);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix[i][j] = matrix1[i][j] * num;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return o;
    }
}
