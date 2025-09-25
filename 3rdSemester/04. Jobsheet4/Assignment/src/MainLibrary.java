public class MainLibrary {
    public static void main(String[] args) {
        Author a1 = new Author("J.K. Rowling");
        Author a2 = new Author("George Orwell");
        Book b1 = new Book("Harry Potter", a1);
        Book b2 = new Book("1984", a2);
        Library library = new Library("City Library");
        library.addBook(b1);
        library.addBook(b2);
        Member m1 = new Member("Alice");
        Member m2 = new Member("Bob");
        library.listBooks();
        m1.borrowBook(b1);
        m2.borrowBook(b1);
        m2.borrowBook(b2);
        m1.listBorrowedBooks();
        m2.listBorrowedBooks();
        m1.returnBook(b1);
        m2.borrowBook(b1);
        library.listBooks();
    }
}