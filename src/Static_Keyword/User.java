package Static_Keyword;

public class User {
    public String name;
    public static int counter = 0;
    static {
        System.out.println("2. Static Kod Bloğu");
        int random = (int) (Math.random() * 10);
        System.out.println("3. Random Sayı: " + random);
        counter = random;
        System.out.println("4. Counter varsayılan değer: " + counter);
    }

    public User(String name) {
        this.name = name;
        counter++;
        System.out.println("Counter yeni değer: " + counter);
    }
}
