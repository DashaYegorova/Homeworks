package lesson12;

public class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Class Rectangle");
    }


}
