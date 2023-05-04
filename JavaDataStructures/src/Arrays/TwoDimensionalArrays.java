package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class TwoDimensionalArrays {

    public static void traverse(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i=0; i<rows;i++){
            for(int j=0; j<cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for(int val:arr){
            sum = sum + val;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,400},{4,5,6,100},{7,8,9,10}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
        traverse(arr);
        Arrays.sort(arr, (int[] o1,int[] o2)->(getSum(o1) - getSum(o2)));
        Arrays.sort(arr, (int[] o1,int[] o2)->(o1[o1.length-1] - o2[o2.length-1]));
        System.out.println(Arrays.deepToString(arr));

    }
}
