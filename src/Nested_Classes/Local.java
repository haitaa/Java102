package Nested_Classes;

public class Local {
    public void run() {

        // Local Class
        class Yerel {
            private int a;
            public Yerel(int a) {
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }

        Yerel yerel = new Yerel(15);
        System.out.println("Local sınıfı çalıştı!");
        System.out.println(yerel.getA());
    }


}
