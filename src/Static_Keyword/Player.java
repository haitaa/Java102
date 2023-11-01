package Static_Keyword;

public class Player {
    public String name;
    public int id;
    public static int count = 0;

    public Player(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void showName(String name, int id) {
        Player p1 = new Player(name, id);
        System.out.println(p1.name);
    }
}
