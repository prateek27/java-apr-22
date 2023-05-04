package Arrays;

public class DynamicArray {
    private int arr[];
    private int capacity;
    private int currentSize;
    private static final int DEFAULT = 10;

    public DynamicArray()
    {
        arr = new int[DEFAULT];
        capacity = DEFAULT;
        currentSize = 0;
    }
    public DynamicArray(int cap)
    {
        arr = new int[cap];
        capacity = cap;
        currentSize = 0;
    }
    public void add(int data){

        if(currentSize==capacity){
            int[] oldArr = arr;

            arr = new int[2*capacity];
            for(int i=0; i<capacity; i++){
                arr[i] = oldArr[i];
            }
            oldArr = null;
            capacity = 2*capacity;
        }

        arr[currentSize] = data;
        currentSize++;
    }
    public void remove(){
        //remove the last element
        currentSize--;
    }

    public int get(int i){
        return arr[i];
    }
    public int getCapacity(){
        return capacity;
    }
    public int size(){
        return currentSize;
    }

}
