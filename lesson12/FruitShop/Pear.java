package lesson12.FruitShop;

public class Pear extends Fruit {
    private double cost;

    public Pear(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double cost(Fruit fruit) {
        return (getWeight() * cost);
    }
}
