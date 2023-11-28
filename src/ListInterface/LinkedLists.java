package ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedLists {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Mustafa");
        liste.add("Haita");
        liste.add("Java");
        liste.add("102");

        liste.remove("Mustafa");

        Iterator<String> itr = liste.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        /*
        for(String str : liste) {
            System.out.println(str);
        }
       */
    }
}
