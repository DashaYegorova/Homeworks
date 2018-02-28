package lesson12.Animals;

public class Dog extends Animal {
    private int barkLoud;

    public Dog(String food, String location, int barkLoud) {
        super(food, location);
        this.barkLoud = barkLoud;
    }

    public int getBarkLoud() {
        return barkLoud;
    }

    public void setBarkLoud(int barkLoud) {
        this.barkLoud = barkLoud;
    }

    public void makeNoize() {
        System.out.println("Собака лает");
    }

    public void eat() {
        System.out.println("Собака ест");
    }

    public void sleep() {
        System.out.println("Собака спит");
    }
}
