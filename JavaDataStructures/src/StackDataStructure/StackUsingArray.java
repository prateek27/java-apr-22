package StackDataStructure;

public class StackUsingArray {
    protected int[] data;
    protected int top;

    public static final int DEFAULT_CAPACITY = 10;

    public StackUsingArray(){
        data = new int[DEFAULT_CAPACITY];
        top = -1;
    }
    public StackUsingArray(int capacity) throws Exception{
        if(capacity<1){
            throw new Exception("Invalid stack capacity");
        }
        this.data = new int[capacity];
        this.top = -1;
    }

    public int getSize(){
        return top + 1;
    }

    public boolean empty(){
        return getSize()==0;
    }

    public void push(int item) throws Exception{
            if(getSize()==this.data.length){
                throw new Exception("Stack is full");
            }
            top++;
            data[top] = item;
    }

    public int pop() throws Exception{
            if(getSize()==0){
                throw new Exception("Stack is empty!");
            }
            int ans = data[top];
            data[top] = 0;
            top--;
            return ans;
    }

    public int peek() throws Exception{
        if(getSize()==0){
            throw new Exception("Stack is empty!");
        }
        return data[top];
    }

    public void display(){
        for(int i=top; i>=0; i--){
            System.out.println(data[i]);
        }
        System.out.println();
    }
}
