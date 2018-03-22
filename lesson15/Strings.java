package lesson15;

/**
 * Created by Student on 12.03.2018.
 */
public class Strings {
    public static void main(String[] args) {
        verifyString("I like Java!!!");
        verifyString("I hate Java");
        lastChar("I like Java!!!");
        lastChar("I hate Java");
        find("I like Java");
        modifyString("I like Java!!!");
        System.out.println("I like Java".substring(7, 11));
    }

    public static void verifyString(String str) {
        System.out.println(str);
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
    }

    public static void lastChar(String str) {
        System.out.println(str.charAt(str.length() - 1));
    }

    public static void find(String str) {
        System.out.println(str.indexOf("Java"));
    }

    public static void modifyString(String str) {
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
    }
}
