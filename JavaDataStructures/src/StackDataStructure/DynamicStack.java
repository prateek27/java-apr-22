package StackDataStructure;

public class DynamicStack extends StackUsingArray {
    // ArrayList or LinkedList
    public DynamicStack() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public DynamicStack(int capacity) throws Exception {
        super(capacity);
    }

    public void push(int item) throws Exception {
        if (getSize() == data.length) {
            int[] arr = new int[2 * data.length];
            for (int i = 0; i < this.getSize(); i++) {
                arr[i] = data[i];
            }
            this.data = arr;
        }
        super.push(item);
    }
}
