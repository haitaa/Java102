package SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(40);
        hSet.add(null);

        //System.out.println(hSet.contains(20));

        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
