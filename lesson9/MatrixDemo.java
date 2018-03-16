package lesson9;

import java.util.Arrays;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        Matrix z = new Matrix(a);
        Matrix d = new Matrix(a);
        Matrix multipleResult = z.multiple(6);
        System.out.println(multipleResult);
        Matrix plusResult = z.plus(d);
        System.out.println(plusResult);

    }
}
