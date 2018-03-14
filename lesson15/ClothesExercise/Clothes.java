package lesson15.ClothesExercise;

import java.util.Objects;

public abstract class Clothes {
    private ClothesSize size;
    private double cost;
    private String color;

    public Clothes(ClothesSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothesSize getSize() {
        return size;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return size == clothes.size &&
                Double.compare(clothes.cost, cost) == 0 &&
                Objects.equals(color, clothes.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(size, cost, color);
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
