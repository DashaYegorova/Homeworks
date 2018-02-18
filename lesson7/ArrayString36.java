package lesson7;

/**
 * Created by Student on 09.02.2018.
 */
public class ArrayString36 {
    public static void main(String[] args) {
        char c = 'a';
        String[][] array = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = c + "" + (j + 1);
                System.out.print(array[i][j] + " ");
            }
            c++;
            System.out.println();
        }
    }
}
