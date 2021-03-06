package lesson15.ClothesExercise;

public class Skirt extends Clothes implements WomanClothes {
    public Skirt(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void toDressWoman() {
        System.out.println("Надеваю юбку.");
    }

    @Override
    public String toString() {
        return "Skirt{} " + super.toString();
    }
}
