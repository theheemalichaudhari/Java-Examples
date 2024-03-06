import java.util.ArrayList;

// Library class using aggregation (HAS-A relationship with Book)
public class Library {
    ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Data Structures", "Jane Smith");

        library.addBook(book1);
        library.addBook(book2);

        // Accessing books in the library
        for (Book book : library.books) {
            System.out.println("Title: " + book.title + ", Author: " + book.author);
        }
    }
}
