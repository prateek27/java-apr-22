package QueueDataStructure;

public class Queue {

    protected int[] arr;
    protected int size;
    protected int front;
    public static final int DEFAULT_CAPACITY = 10;

    public Queue() throws Exception{
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) throws Exception{
        if(capacity<1){
            throw new Exception("Invalid Capacity!");
        }
        this.arr = new int[capacity];
        this.size = 0;
        this.front = 0;
    }
    //O(1)
    public void enqueue(int value) throws Exception{
        //Queue if full
        if(this.size==this.arr.length){
            throw new Exception("Queue is full");
        }
        int rear = (this.front + this.size)%this.arr.length;
        this.arr[rear] = value;
        this.size++;
    }
    //O(1)
    public int dequeue() throws Exception{
        // Queue is Empty
        if(this.size==0){
            throw new Exception("Queue is Empty");
        }
        int ans = this.arr[this.front];
        this.front = (this.front + 1)%this.arr.length;
        this.size--;
        return ans;
    }
    // O(1)
    public int peek() throws Exception{
        if(this.size==0){
            throw new Exception("Queue is Empty");
        }
        return this.arr[this.front];
    }

    public boolean empty(){
        return this.size==0;
    }
    public boolean full(){
        return this.size==this.arr.length;
    }
    public int size(){
        return this.size;
    }

    //Debugging
    public void display(){
        for(int i=0; i<this.size; i++){
            int idx = (this.front + i)%this.arr.length;
            System.out.print(this.arr[idx]+",");
        }
        System.out.println();
    }

}
