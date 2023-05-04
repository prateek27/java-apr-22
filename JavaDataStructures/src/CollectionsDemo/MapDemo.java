package CollectionsDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> menu = new TreeMap<>();


        menu.put("Dosa",200);
        menu.put("Burger",50);
        menu.put("noodles",70);
        menu.remove("Burger");

        menu.putIfAbsent("pizza",200);
        System.out.println(menu.getOrDefault("pizza",0));

        if(menu.containsKey("Dosa")){
            System.out.println("Dosa found!");
        }
        System.out.println(menu);

        //Way-1
        for (Map.Entry<String, Integer> e: menu.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //Way-2
        for (String key: menu.keySet()) {
            System.out.println(key);
        }

        //Way-3
        for(Integer value: menu.values()) {
            System.out.println(value);
        }
    }
}
