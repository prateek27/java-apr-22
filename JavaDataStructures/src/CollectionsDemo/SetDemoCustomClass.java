package CollectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemoCustomClass {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        books.add(new Book("C++",1,100));
        books.add(new Book("C++ V2",1,120));
        books.add(new Book("Java",2,200));
        System.out.println(books.size());
        System.out.println(books);
    }
}
