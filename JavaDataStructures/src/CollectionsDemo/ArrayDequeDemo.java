package CollectionsDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(12);
        dq.offerFirst(15);
        dq.offerLast(20);
        dq.offer(30);
        System.out.println(dq);

        System.out.println(dq.pollLast());
        System.out.println(dq.pollFirst());

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
    }
}
