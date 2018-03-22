package lesson17;

import java.util.Formatter;

public class FormatString {
    public static void main(String[] args) {
        createString("Иванов", "философия", 5);
        createString("Петров", "физика", 3);
    }

    private static void createString(String fullName, String subject, int mark) {
        String str = String.format("Студент %-15s получил %-3d по %-10s%n", fullName, mark, subject);
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
        }
    }
}
