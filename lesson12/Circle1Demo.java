package lesson12;

public class Circle1Demo {
    public static void main(String[] args) {
        Circle1 circle1 = new Circle1(5);
        Circle1 circle2 = new Circle1(8);
        Circle1 circle3 = new Circle1(12);
        Circle1 circle4 = new Circle1(2);
        Circle1 circle5 = new Circle1(4);

        System.out.println("Площадь первого круга " + circle1.area() +
                ", Длина окружности " + circle1.circuit());
        System.out.println("Площадь второго круга " + circle2.area() +
                ", Длина окружности " + circle2.circuit());
        System.out.println("Площадь третьего круга " + circle3.area() +
                ", Длина окружности " + circle3.circuit());
        System.out.println("Площадь четвёртого круга " + circle4.area() +
                ", Длина окружности " + circle4.circuit());
    }
}
