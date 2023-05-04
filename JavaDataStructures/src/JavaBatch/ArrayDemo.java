package JavaBatch;

import java.util.Arrays;

public class ArrayDemo {

    public static void doubleMoney(int[] money){
        for(int i=0; i<money.length;i++){
            money[i] = 2*money[i];
        }
    }

    public static void main(String[] args) {
        int money[] = {5,10,15};
        doubleMoney(money);
        System.out.println(Arrays.toString(money));
    }
}
