package lesson21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Student on 13.04.2018.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<HeavyBox> list = new ArrayList<>();
        list.add(new HeavyBox(5, 4, 7, 400));
        list.add(new HeavyBox(1, 1, 1, 100));
        list.add(new HeavyBox(4, 6, 23, 700));
        list.add(new HeavyBox(6, 3, 6, 600));

        List<HeavyBox> result = getBigBoxes(list);
        System.out.println(list);
        System.out.println(result);
    }

    private static List<HeavyBox> getBigBoxes(List<HeavyBox> list) {
        List<HeavyBox> result = new ArrayList<>();
        Iterator<HeavyBox> iterator = list.iterator();
        while (iterator.hasNext()) {
            HeavyBox box = iterator.next();
            if (box.getWeight() > 300) {
                result.add(box);
                iterator.remove();
            }
        }
        return result;
    }
}
