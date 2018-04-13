package lesson21;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Student on 13.04.2018.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<HeavyBox> deque = new ArrayDeque<>();
        deque.offer(new HeavyBox());
        deque.offer(new HeavyBox(1,1,1,1));
        deque.offer(new HeavyBox(6,4,6,3));
        deque.offer(new HeavyBox(3,6,23,8));
        while (!deque.isEmpty()) {
            System.out.println(deque.poll() + " ");
        }
    }
}
