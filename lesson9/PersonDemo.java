package lesson9;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.fullName = "Kevin";
        p1.age = 23;
        Person p2 = new Person("Nick", 25);
    }
}
