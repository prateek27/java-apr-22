package StackDataStructure;

public class StackDemo {
    public static void main(String[] args) throws Exception {
       StackUsingArray s = new StackUsingArray(50);
       s.push(1);
       s.push(2);
       s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        while(!s.empty()){
            int top = s.peek();
            System.out.println(top);
            s.pop();
        }
        //s.display();
    }
}
