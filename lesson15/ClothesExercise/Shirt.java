package lesson15.ClothesExercise;

public class Shirt extends Clothes implements ManClothes, WomanClothes {

    public Shirt(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("Надеваю футболку.");
    }

    @Override
    public void toDressWoman() {
        System.out.println("Надеваю футболку.");
    }

    @Override
    public String toString() {
        return "Shirt{} " + super.toString();
    }
}
