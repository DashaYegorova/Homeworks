package lesson12;

public class ShapeDemo {
    public static void main(String[] args) {

        Shape circle = new Circle("red");
        Shape rectangle = new Rectangle("green");

        Shape[] shapes = {circle, rectangle};
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}


