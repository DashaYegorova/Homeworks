package lesson17;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("object oriented programming");

        str.replace(str.indexOf("o"), str.indexOf(" "), "O");
        str.replace(str.indexOf("o"), str.lastIndexOf(" "), "O");
        str.replace(str.indexOf("p"), str.length(), "P");
        int pos = 0;
        while ((pos = str.indexOf(" ")) != -1) {
            str.replace(pos, pos + 1, "");
        }
        System.out.println(str);
    }
}

