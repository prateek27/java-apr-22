package JavaBatch;

public class LinkedList {
    //Data Members
    Node head;
    Node tail;
    int size;

    //Methods
    LinkedList(){
        head = tail = null;
        size = 0;
    }

    public void addFirst(int d){
        Node n = new Node(d);
        n.next = head;
        head = n;
        if(size==0){
            tail = n;
        }
        size++;
    }
    public void addLast(int d){
        Node n = new Node(d);
        if(size==0){
            head = tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public void addAtPos(int d,int idx) throws Exception{
        if(idx<0 || idx >size){
            throw new Exception("Index of bounds");
        }
        if(idx==0){
            addFirst(d);
        }
        else if(idx==size){
            addLast(d);
        }
        else{
            Node temp = head;
            for(int jump=1;jump<=idx-1; jump++){
                temp = temp.next;
            }
            Node n = new Node(d);
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }

    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }
    // Todo: Exception Handling if index is out of bounds
    public int getAtPos(int idx){
        if(idx==0){
            return getFirst();
        }
        else if(idx==size-1){
            return getLast();
        }
        else{
            Node temp = head;
            for(int jump=1;jump<=idx; jump++){
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public int getSize(){
        return size;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeFirst() throws Exception{
        if(size==0){
            throw new Exception("cant remove from empty linked list");
        }
        else if(size==1){
            head = tail = null;
            size=0;
        }
        else {
            head = head.next;
            size--;
        }
    }

    public void removeAtPos(int idx) throws Exception{
        if(size==0){
            throw new Exception("Empty Linked List");
        }
        if(idx<0||idx>=size){
            throw new Exception("Index out of bounds");
        }
        else if(idx==0){
            removeFirst();
        }
        else if(idx==size-1){
            removeLast();
        }
        else{
            Node temp = head;
            for(int jump=1; jump<=idx-1; jump++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public Node midNode(){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //Interview Problem
    public void reverse(){
        Node prev = null;
        Node current = head;
        tail = head;
        while(current!=null){
            Node temp = current.next; //save the next node
            current.next = prev;
            //update prev and current
            prev = current;
            current = temp;
        }
        head = prev;
    }


    public void removeLast() throws Exception{
        if(size==0){
            throw new Exception("cant remove from empty linked list");
        }
        else if(size==1){
            head = tail = null;
            size=0;
        }
        else{
            Node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }
}
