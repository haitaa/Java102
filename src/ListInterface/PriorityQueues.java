package ListInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        queue.add("Mustafa");
        queue.add("Haita");
        queue.add("Ahmet");
        queue.add("Damla");

        for(String i : queue) {
            System.out.println(i);
        }
    }
}
