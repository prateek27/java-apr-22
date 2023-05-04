package Arrays;
import java.util.Arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Book [] books = new Book[3];
        Book b = new Book("C++",1,100);
        books[1] = new Book("Java",2,200);
        books[2] = new Book("Python",3,150);
        books[0] = b;

        System.out.println(books);
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, (b1,b2)->(b1.price-b2.price));
        System.out.println(Arrays.toString(books));

    }
}
