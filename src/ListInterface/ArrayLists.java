package ListInterface;

import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> liste = new java.util.ArrayList<>();
        liste.add(10);
        liste.add(1);
        liste.add(4);
        liste.add(5);
        liste.add(null);

        /*
        Iterator<Integer> itr = liste.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        */

        //System.out.println(liste.get(0));

        for(Integer i : liste) {
            //System.out.println(i);
        }


        List<String> liste2 = new java.util.ArrayList<>();
        liste2.add("Istanbul");
        liste2.add("Ankara");
        liste2.add("Izmir");
        liste2.add("Kocaeli");
        liste2.add("Bursa");

        /*
        List<String> liste3 = liste2.subList(1, 4);
        System.out.println(liste3);
         */

        Object[] objectArr = liste2.toArray();
        String[] str = liste2.toArray(new String[0]);
        System.out.println(str[0]);
    }
}
