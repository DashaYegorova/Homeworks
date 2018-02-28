package lesson12.Animals;

public class Cat extends Animal {
    private String favoriteToy;

    public Cat(String food, String location, String favoriteToy) {
        super(food, location);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public void makeNoize() {
        System.out.println("Кот мяукает");
    }

    public void eat() {
        System.out.println("Кот ест");
    }

    public void sleep() {
        System.out.println("Кот спит");
    }
}
