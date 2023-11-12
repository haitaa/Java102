package Liste_Sinifi_Yapmak;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        //System.out.println(list.getCapacity());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        //System.out.println(list.getCapacity());
        //System.out.println(list.get(5));
        //list.remove(4);
        //list.set(2, 95);
        //list.printArr();
        //System.out.println(list.indexOf(200));

        MyList<Integer> myList = new MyList<>();
        Object[] dizi = list.toArray();
        System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        //myList.clear();
        //myList.printArr();

        MyList<Integer> altListem = list.sublist(1, 4);
        altListem.printArr();
        System.out.println(myList.contains(20));
    }
}
