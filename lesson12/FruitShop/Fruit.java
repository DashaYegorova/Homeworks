package lesson12.FruitShop;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static final void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public abstract double cost(Fruit fruit);

}
