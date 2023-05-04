package JavaBatch;

public class LinkedListTest {
    public static void main(String[] args) throws Exception {
        LinkedList l = new LinkedList();
        l.addLast(6);
        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);
        l.addLast(7);
        l.display();
        System.out.println(l.getSize());
        l.addAtPos(5,4);
        l.addAtPos(0,0);
        l.display();
        l.removeFirst();
        l.removeLast();
        l.display();
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.getAtPos(3));
        //l.removeAtPos(4);
        l.display();
        l.reverse();
        l.display();

        System.out.println(l.midNode().data);

//        Node a = new Node(5);
//        Node b = new Node(6);
//        a.next = b;
//
//        System.out.println(a);
//        System.out.println(a.next);

    }
}
