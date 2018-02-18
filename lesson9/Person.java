package lesson9;

public class Person {
    String fullName;
    int age;

    Person() {
    }

    Person(String fullName, int age) {
    }

    void move(Person p) {
        System.out.println(p.fullName + " двигается!");
    }

    void talk(Person p) {
        System.out.println(p.fullName + " говорит!");
    }
}
