package Generic_Classes;

public class Main {
    public static void main(String[] args) {
        /*
        Nullable<Integer> n = new Nullable<>(10);
        n.run();
        */

        Integer a = 10;
        String b = "Patika";
        Double c = 3.14;
        Test<Integer, String, Double> t = new Test<>(a, b, c);
        t.showInfo();
    }
}
