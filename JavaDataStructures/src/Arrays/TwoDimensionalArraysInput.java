package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class TwoDimensionalArraysInput {
    public static void main(String[] args) {
        // Create a 2D array of size N X M and read it
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //Print
        System.out.println(Arrays.deepToString(arr));
    }
}
