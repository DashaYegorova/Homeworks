package lesson12.Animals;

public class Horse extends Animal {
    private int speed;

    public Horse(String food, String location, int speed) {
        super(food, location);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void makeNoize() {
        System.out.println("Лошадь ржёт");
    }

    public void eat() {
        System.out.println("Лошадь ест");
    }

    public void sleep() {
        System.out.println("Лошадь спит");
    }
}
