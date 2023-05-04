package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        // Jagged Array - > with variable no of cols in row
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();

        int[][] arr = new int[R][];

        for(int i=0; i<R; i++){
            System.out.println("Cols in current row");
            int colsInCurrentRow = sc.nextInt();
            System.out.println("Data in current row");
            arr[i] = new int[colsInCurrentRow];
            for(int j=0; j<colsInCurrentRow; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
