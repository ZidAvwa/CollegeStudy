import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private List<Book> borrowed;

    public Member(String name) {
        this.name = name;
        this.borrowed = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        if (book.borrow()) {
            borrowed.add(book);
            System.out.println(name + " borrowed " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(Book book) {
        if (borrowed.contains(book)) {
            book.returnBook();
            borrowed.remove(book);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow " + book.getTitle());
        }
    }

    public void listBorrowedBooks() {
        System.out.println("Books borrowed by " + name + ":");
        for (Book book : borrowed) {
            System.out.println(book.getTitle());
        }
    }
}