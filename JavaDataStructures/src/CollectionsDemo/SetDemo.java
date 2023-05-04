package CollectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Set<Integer> s = new HashSet<>();
        // Set<Integer> s = new LinkedHashSet<>();
        Set<Integer> s = new TreeSet<>();
        s.add(10);
        s.add(20);
        s.add(18);
        s.add(15);
        s.add(40);
        s.add(10);
        s.remove(40);
        System.out.println(s);
        System.out.println(s.contains(20));
        //add, remove, contains, size
        System.out.println(s.size());

    }
}
