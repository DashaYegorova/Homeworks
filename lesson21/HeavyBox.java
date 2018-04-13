package lesson21;

/**
 * Created by Student on 13.04.2018.
 */
public class HeavyBox extends Box6 implements Comparable<HeavyBox> {
    int weight; // вес коробки

    public HeavyBox() {
    }

    public HeavyBox(int width, int height, int depth, int weight) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public int compareTo(HeavyBox heavyBox) {
        return this.weight - heavyBox.weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                "} " + super.toString();
    }
}
