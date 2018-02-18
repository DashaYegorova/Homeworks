package lesson9;

import java.util.Arrays;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix z = new Matrix(3, 3);
        int [][]array = new int[3][3];
        int [][] m1 = new int[3][3];
        int [][] m2 = new int[3][3];
        z.print();
        z.plus(array, m1, m2);

//

    }
}
