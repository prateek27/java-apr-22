package Arrays;
import java.util.Arrays;

public class PassingArraysToFunctions {

    public static void doubleMoney(int money){
        money = 2*money;
    }
    public static void doubleMoney(int[] money){
        for(int i=0; i<money.length; i++){
            money[i] = 2*money[i];
        }
    }

    public static void main(String[] args) {
        // Passing Arrays vs Primitves to Functions
        int money = 100;
        int[] friendsMoney = {100,200,300};

        doubleMoney(money);
        doubleMoney(friendsMoney);
        System.out.println(money);
        System.out.println(Arrays.toString(friendsMoney));
    }
}
