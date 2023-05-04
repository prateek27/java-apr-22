package LinkedListDataStructure;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    LinkedList(){
        head = tail = null;
        size = 0;
    }
    //O(1)
    public void addFirst(int data){
        Node n = new Node(data);
        n.next = head;
        head = n;
        if(size==0){
            tail = n;
        }
        size++;
    }
    //O(1)
    public void addLast(int data){
        Node n = new Node(data);
        if(size==0){
            head = tail = n;
        }
        tail.next = n;
        tail = tail.next;
        size++;
    }
    //O(N)
    public void addAt(int data,int idx) throws Exception{
        if(idx<0 || idx>size){
            throw new Exception("Index of bounds");
        }
        if(idx==0){
            addFirst(data);
        }
        else if(idx==size){
            addLast(data);
        }
        else{
            Node temp = head;
            for(int jump=1; jump<=idx-1; jump++){
                temp = temp.next;
            }
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }
    public int getFirst() throws Exception{
        if(size==0){
            throw new Exception("Linked List is Empty!");
        }
        return head.data;
    }
    public int getLast() throws Exception{
        if(size==0){
            throw new Exception("Linked List is Empty!");
        }
        return tail.data;
    }
    public int getAt(int idx) throws Exception{
        if(size==0){
            throw new Exception("Linked List is Empty!");
        }
        else if(idx<0 || idx>size){
            throw new Exception("Index of bounds");
        }
        else if(idx==0){
            return getFirst();
        }
        else if(idx==size-1){
            return getLast();
        }
        else{
            Node temp = head;
            for(int jump=1; jump<=idx;jump++){
                temp = temp.next;
            }
            return temp.data;
        }
    }
    public int removeFirst() throws Exception{
        if(size==0){
            throw new Exception("Linked List is Empty!");
        }
        int output = head.data;
        if(size==1){
            head = tail = null;
            size = 0;
        }
        else {
            head = head.next;
            this.size--;
        }
        return output;
    }

    public int removeLast() throws Exception{
        if(size==0){
            throw new Exception("Linked List is Empty!");
        }
        int output = tail.data;
        if(size==1){
            head = tail = null;
            size = 0;
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
        return output;
    }

    public int removeAt(int idx) throws Exception{
        if(size==0){
            throw new Exception("Linked list is empty!");
        }
        if(idx<0||idx>=size){
            throw new Exception("Linked list is empty!");
        }
        if(idx==0){
            return removeFirst();
        }
        else if(idx==size-1){
            return removeLast();
        }
        else{
             Node temp = head;
             for(int jump=1; jump<idx; jump++){
                 temp = temp.next;
             }
             Node output = temp.next;
             temp.next = output.next;
             size--;
             return output.data;
        }
    }

    //O(1)
    public int getSize(){
        return size;
    }
    //O(N)
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }
}
