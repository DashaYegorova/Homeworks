package lesson15.ClothesExercise;

public class Pants extends Clothes implements ManClothes, WomanClothes {
    public Pants(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("Надеваю штаны.");
    }

    @Override
    public void toDressWoman() {
        System.out.println("Надеваю штаны.");
    }

    @Override
    public String toString() {
        return "Pants{} " + super.toString();
    }
}
