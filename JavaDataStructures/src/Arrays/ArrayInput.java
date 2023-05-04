package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        //Read N Numbers and Print them in Reverse
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=N-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
