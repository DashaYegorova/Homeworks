package lesson6;

public class Factorial {
    public static void main(String[] args) {
        int n = getRandomNumber(30);
        System.out.println(n);
        int j = 1;
        for (int i = 1; i <= n; i++) {
            j *= i;
        }
        System.out.println(j);
    }

    static int getRandomNumber(int n) {
        return (int) (Math.random() * n);
    }
}

