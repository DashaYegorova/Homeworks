package lesson9;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {
    int strings, columns;
    int[][] array;


    Matrix(int[][] array) {
        this.array = array;
        this.strings = array.length;
        this.columns = array[0].length;

    }



    Matrix plus(Matrix matrix) {
        int[][] result = new int[strings][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                result[i][j] = this.array[i][j] + matrix.array[i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));
        Matrix o = new Matrix(result);
        return o;
    }

    Matrix multiple(int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                this.array[i][j] *= num;

            }
        }
        System.out.println(Arrays.deepToString(array));
        Matrix o = new Matrix(array);
        return o;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "strings=" + strings +
                ", columns=" + columns +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
