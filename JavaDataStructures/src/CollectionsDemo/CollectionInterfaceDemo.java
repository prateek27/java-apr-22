package CollectionsDemo;

import java.util.*;

public class CollectionInterfaceDemo {

    public static void main(String[] args) {
        Collection<String> s1 = new ArrayList<>();
        s1.add("Hello");
        s1.add("World");

        Collection<String > s2 = new HashSet<>();
        s2.add("A");
        s2.add("B");
        s2.add("C");
        s2.add("D");

        s2.addAll(s1);

        System.out.println(s1);
        System.out.println(s2);

    }
}
