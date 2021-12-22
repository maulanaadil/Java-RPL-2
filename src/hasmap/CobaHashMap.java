package hasmap;

import java.util.Collection;
import java.util.HashMap;

public class CobaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pasangan = new HashMap<>();

        pasangan.put("1", "Dian Nitami");
        pasangan.put("2", "Raisa");
        pasangan.put("3", "Audy");

        //munculkan nama istri dari masing-masing suami dengan urutan yang
        //sesuai dengan output yang diberikan

        Collection<String> values = pasangan.values();
        for (String value : values) {
            System.out.println(value);
        }

    }
}
