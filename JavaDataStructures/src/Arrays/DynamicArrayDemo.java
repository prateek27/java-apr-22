package Arrays;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray da = new DynamicArray(5);
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        System.out.println(da.size());
        System.out.println(da.getCapacity());
        da.add(7);
        da.remove();
        da.add(8);

        System.out.println();
        for(int i=0; i<da.size();i++){
            System.out.print(da.get(i) + " ");
        }

    }

}
