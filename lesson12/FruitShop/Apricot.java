package lesson12.FruitShop;

public class Apricot extends Fruit {
    private double cost;

    public Apricot(double weight, double cost) {
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
