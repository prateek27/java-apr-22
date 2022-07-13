import java.util.Scanner;

class Hello{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		 
        // Use it
        System.out.println("Hello");
        System.out.println("World");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
	}
}