package Arrays;

public class Book {
    int isbn;
    String name;
    int price;

    public Book(String name, int isbn, int price) {
        this.name = name;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "CollectionsDemo.Book{" +
                "isbn=" + isbn +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}