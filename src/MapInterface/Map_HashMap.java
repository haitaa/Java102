package MapInterface;

import java.util.HashMap;
import java.util.Map;

public class Map_HashMap {
    public static void main(String[] args) {
        Map<String, String> country = new HashMap<>();

        country.put("TR", "Türkiye");
        country.put("GR", "Yunanistan");
        country.put("EN", "İngiltere");

        //System.out.println(country.get("TR"));

        for(String countryKey : country.keySet()) {
            System.out.println(country.get(countryKey));
        }
    }
}
