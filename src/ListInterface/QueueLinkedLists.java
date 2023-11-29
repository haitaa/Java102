package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedLists {
    public static void main(String[] args) {

        // Polymorphism
        Queue<String> queue = new LinkedList<>();
        queue.add("Mustafa");
        queue.add("Haita");
        queue.offer("Patika");

        queue.remove("Haita");

        Iterator<String> itr = queue.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
