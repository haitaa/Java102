package Generic_Classes;

public class Main {
    public static void main(String[] args) {
        /*
        Nullable<Integer> n = new Nullable<>(10);
        n.run();
        */

        /*
        Integer a = 10;
        String b = "Patika";
        Double c = 3.14;
        Test<Integer, String, Double> t = new Test<>(a, b, c);
        t.showInfo();
         */

        /*
        String[] a = {"Java", "102", "Patika", "Dev"};
        Integer[] b = {1, 2, 3, 4};
        Character[] c = {'J', 'A', 'V', 'A'};

        Print.printArray(a, b);


        Print.printArray(a);
        Print.printArray(b);
        Print.printArray(c);
        */

        Student<String> stu = new Student<>();
        stu.insert("Patika");
    }
}
