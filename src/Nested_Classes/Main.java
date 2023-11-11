package Nested_Classes;

public class Main {
    public static void main(String[] args) {
        // Nested Class (İç içe Sınıflar)
        //Out out = new Out();
        //out.run();

        //Out out = new Out();
        //Out.In in = out.new In();
        //in.run();

        //Out out = new Out();
        //Out.In in = out.getIn();
        //in.run();

        //Out.In in = new Out.In();
        //in.run();

        //Local local = new Local();
        //local.run();

        /*
        Anonym anonym = new Anonym() {
            public int a = 20;
            @Override
            public void run() {
                System.out.println(this.a);
                System.out.println("Anonim olarak yazılmış run metodu!");
                print();
            }

            public void print() {
                System.out.println("Print metodu");
            }
        };
        anonym.run();
         */

        // Boxing
        // Unboxing

        int a = 10;

        // Autoboxing
        Integer b = a; // Integer.valueOf(a);

        // Boxing
        Integer c = Integer.valueOf(a);

    }
}
