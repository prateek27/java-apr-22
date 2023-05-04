package CollectionsDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println(q);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());

    }
}
