package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(-20);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2,15);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.addAll(list);
        System.out.println(list2);

        list.remove(1);
        list.remove(Integer.valueOf(1)); //1 as object
        System.out.println(list);

        if(list.contains(15)){
            System.out.println("yes 15 is present");
        }
        list2.set(0,50);
        // For Loop
        for(int i=0; i<list2.size(); i++){
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();

        // For Each Loop
        for(Integer x : list2){
            System.out.println(x + " ");
        }
        // Using an Iterator
        Iterator<Integer> it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
