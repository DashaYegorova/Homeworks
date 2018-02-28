package lesson12.Animals;

public class Vet {
    void treatAnimal(Animal animal) {
        System.out.println(animal.getFood() + " " + animal.getLocation());
    }

    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("meat", "Kharkiv", 7);
        animals[1] = new Cat("meat", "Poltava", "Mouse");
        animals[2] = new Horse("grass", "Odessa", 60);

        for (Animal animals1 : animals) {
            vet.treatAnimal(animals1);
        }
    }
}
