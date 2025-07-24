 import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Remove a book by ID
    public boolean removeBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                books.remove(b);
                System.out.println("Book removed.");
                return true;
            }
        }
        System.out.println("Book not found.");
        return false;
    }

    // Search for a book by title (partial or full match)
    public void searchBook(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(b);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching the title.");
        }
    }

    // List all books
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
