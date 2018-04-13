package lesson21;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Student on 13.04.2018.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<HeavyBox> set = new TreeSet<>();
        set.add(new HeavyBox());
        set.add(new HeavyBox(1,1,1,1));
        set.add(new HeavyBox(3,3,3,3));
        set.add(new HeavyBox(2,2,2,2));
        for(HeavyBox heavyBox : set) {
            System.out.println(heavyBox);
        }
    }
}
