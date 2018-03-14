package lesson15.ClothesExercise;

import lesson15.ClothesExercise.Clothes;
import lesson15.ClothesExercise.ClothesSize;
import lesson15.ClothesExercise.ManClothes;

public class Tie extends Clothes implements ManClothes {
    public Tie(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void toDressMan(Clothes[] clothes) {

    }

    @Override
    public String toString() {
        return "Tie{} " + super.toString();
    }
}
