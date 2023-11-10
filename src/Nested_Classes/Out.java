package Nested_Classes;

// Outer
public class Out {
    public int a = 5;
    public static int b = 10;

    // Inner
    public static class In {
        public static int a = 10;

        public static void run() {
            int a = 1;
            System.out.println(a);
            System.out.println(In.a);
            System.out.println(Out.b);
            //System.out.println(Out.this.a);
            //Out.this.run();
        }
    }

    public void run() {
        In in = new In();
    }

    public In getIn() {
        return new In();
    }
}
