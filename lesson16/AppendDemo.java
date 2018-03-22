package lesson16;

public class AppendDemo {
    public static void main(String[] args) {
        calculate(3, 56);
        calculate(5, 8);
    }

    public static void calculate(int a, int b) {
        StringBuilder sb = new StringBuilder();

        sb.append(a).append(" + ").append(b).append(" = ").append((a + b)).append("\n");
        sb.append(a).append(" - ").append(b).append(" = ").append((a - b)).append("\n");
        sb.append(a).append(" * ").append(b).append(" = ").append((a * b)).append("\n");
        int pos = 0;
        while ((pos = sb.indexOf("=")) != -1) {
            sb.replace(pos, pos+1, "равно");
        }
        System.out.println(sb);
    }
}
