package lesson15.ClothesExercise;

public class Parlour {
    public static void main(String[] args) {
        Shirt shirt = new Shirt(ClothesSize.L, 5.6, "red");
        Pants pants = new Pants(ClothesSize.M, 6.7, "brown");
        Skirt skirt = new Skirt(ClothesSize.XXS, 3.4, "green");
        Tie tie = new Tie(ClothesSize.S, 1.2, "purple");

        Clothes[] clothes = {shirt, pants, skirt, tie};
        toDressMan(clothes);
        toDressWoman(clothes);
    }


    public static void toDressMan(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof ManClothes) {
                ((ManClothes) c).toDressMan();
            }
        }
    }


    public static void toDressWoman(Clothes[] clothes) {
        for (Clothes c : clothes) {
            if (c instanceof WomanClothes) {
                ((WomanClothes) c).toDressWoman();
            }
        }
    }

}
