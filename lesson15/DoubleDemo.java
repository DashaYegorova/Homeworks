package lesson15;

/**
 * Created by Student on 12.03.2018.
 */
public class DoubleDemo {
    public static void main(String[] args) {
        Double double1 = 4.5;
        Double double2 = new Double("4.5");
        Double double4 = Double.valueOf(5.6);
        Double double5 = Double.valueOf("5.6");
        double double6 = Double.parseDouble("6.34");


        System.out.println(double1);
        System.out.println(double2);
        System.out.println(double4);
        System.out.println(double5);
        System.out.println(double6);
    }
}
