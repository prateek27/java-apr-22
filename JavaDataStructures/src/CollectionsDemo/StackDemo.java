package CollectionsDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("C++");
        books.push("Java");
        books.push("Python");

        System.out.println(books);
        System.out.println(books.peek());

        books.pop();
        System.out.println(books.peek());

        while(!books.isEmpty()){
            System.out.println(books.peek());
            books.pop();
        }

    }
}
