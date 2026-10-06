class BookInventory {
    String bookTitle;
    String author;
    double price;

    public BookInventory(String bookTitle, String author, double price) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    public void displayBook() {
        System.out.printf("Book: %s by %s | Price: $%.2f\n", bookTitle, author, price);
    }
}

public class LibraryInventoryManagement {
    public static void main(String[] args) {
        BookInventory b1 = new BookInventory("Java Programming", "James Gosling", 49.99);
        BookInventory b2 = new BookInventory("Clean Code", "Robert C. Martin", 39.95);
        b1.displayBook();
        b2.displayBook();
    }
}
