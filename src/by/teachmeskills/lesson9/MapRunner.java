package by.teachmeskills.lesson9;

import java.util.*;

/**
 * @author Dzmitry Fursevich
 */
public class MapRunner {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k3", "v6");

        System.out.println("map = " + map);

        map.remove("k1");
        System.out.println("map = " + map);

        String v2 = map.get("k2");
        System.out.println("v2 = " + v2);

        boolean containsK2 = map.containsKey("k2");
        System.out.println("containsK2 = " + containsK2);

        Set<String> keys = map.keySet();
        System.out.println("keys = " + keys);

        Collection<String> values = map.values();

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
