package lesson12;

public class Circle1 {
    private int radius;
    private static final double PI = 3.14;

    public Circle1(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public double area() {
        return ((radius * radius) * PI);
    }

    public double circuit() {
        return (2 * PI * radius);
    }
}
