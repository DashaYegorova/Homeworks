package lesson6;

public class Factorial {
    public static void main(String[] args) {
        int n = getRandomNumber(100);
        System.out.println(n);
        int j = 1;
        for (int i = 1; i <= n; i++) {
            j *= i;
            if (i == n) {
                System.out.println(j);
            }
        }
    }

    static int getRandomNumber(int n) {
        return (int) (Math.random() * n);
    }
}

