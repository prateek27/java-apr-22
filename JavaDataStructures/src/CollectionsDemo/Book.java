package CollectionsDemo;

import java.util.Objects;

public class Book {
    int isbn;
    String name;
    int price;

    public Book(String name,int isbn,int price){
        this.name = name;
        this.price = price;
        this.isbn = isbn;
    }

    @Override
    public String toString(){
        return "CollectionsDemo.Book: " + name + " " + "ISBN : " + isbn + "Price : " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book b = (Book) o;
        return isbn == b.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

}

