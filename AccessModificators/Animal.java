package AccessModificators;

public class Animal {
    public int legs;
    private int eyes;
    protected int ears;
    int nose;

    public Animal(){

    }

    public Animal(int legs, int eyes, int ears, int nose) {
        this.legs = legs;
        this.eyes = eyes;
        this.ears = ears;
        this.nose = nose;
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.legs + animal.ears + animal.eyes + animal.nose);
    }
}
