package lesson12.fruitShop;

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

    public static double totalCost(Fruit[] fruit) {
        double totalCost = 0;
        for (Fruit fruits1 : fruit) {
            totalCost += fruits1.cost(fruits1);
        }
        System.out.println("Стоимость всех фруктов " + totalCost);
        return totalCost;
    }
}
