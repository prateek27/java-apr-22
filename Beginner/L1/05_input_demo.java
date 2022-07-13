import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		// Your code goes here

		// Variable 
		int meeting_time = 9; // Store 
		// Update 
		meeting_time = 10;

		System.out.println("meeting_time"); //value ? string ?
		System.out.println(meeting_time);

		String person = "Prof XYZ";
		System.out.println("Join the meeting at " + meeting_time + " with " + person); //Printing 

		// Operators
		System.out.println(5/3); //1
		System.out.println(5%3);  //2

		// Int 4 Datatypes
		byte a1= 120; 
		short a2 = 280;
		int a3 = 50024;
		long a4 = 50002400000000000L;
		int x = (int)a4;

		// Floating Data 
		float a5 = 5.56728976543f; //less precision 
		double a6 = 5.56728976543; // higher precision 

		//Char 
		char a7 = 'a';
		// boolean 
		boolean a8 = true;


		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(x);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);


		// Create a Scanner once and then use it 
		Scanner sc = new Scanner(System.in); //read from standard input (keyboard input)

		String fullname = sc.nextLine();
		System.out.println(fullname);

		/*
		String fname = sc.next();
		String lname = sc.next();
		int age = sc.nextInt();
		float marks = sc.nextFloat();
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(age);
		System.out.println(marks);
		*/

		// read 3 numbers and print their sum 
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("sum " + (a + b + c));
		*/
	}
}
