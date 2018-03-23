package lesson18.toy;

/**
 * Created by Student on 23.03.2018.
 */
public class Toy {
    private String name;
    private double cost;
    private String action;
    static int count;

    public Toy() {
        count++;
    }

    public Toy(String name, double cost, String action) {
        this.name = name;
        this.cost = cost;
        this.action = action;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Toy.count = count;
    }

    public static double totalCost(Toy [] toys) {
        double totalCost = 0;
        for (Toy toy : toys) {
            totalCost += toy.getCost();
        }
        return totalCost;
    }

    public void play() {
        System.out.println("Эта игрушка делает " + getAction());
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy("Leo", 6.7, "arrr");
        Toy toy2 = new Toy("Cat", 7.8, "mew");
        Toy toy3 = new Toy("Dog", 4.5, "bark");
        Toy toy4 = new Toy("Bird", 3.4, "tweet");
        Toy[] toys = {toy1, toy2, toy3, toy4};
        System.out.println("Общее количество всех игрушек " + totalCost(toys));
        System.out.println("Общее количество игрушек " +getCount());
        for (Toy toy : toys) {
            toy.play();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (Double.compare(toy.cost, cost) != 0) return false;
        if (name != null ? !name.equals(toy.name) : toy.name != null) return false;
        return action != null ? action.equals(toy.action) : toy.action == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (action != null ? action.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", action='" + action + '\'' +
                '}';
    }
}
