package FiksturOlustucu;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();
        teams.add(new Team(1, "Fenerbahçe"));
        teams.add(new Team(2, "Galatasaray"));
        teams.add(new Team(3, "Beşiktaş"));
        teams.add(new Team(4, "Trabzonspor"));
        teams.add(new Team(5, "Kocaelispor"));
        teams.add(new Team(6, "Sakaryaspor"));
        Fixture again = new Fixture(teams);
        again.generate();
    }
}
