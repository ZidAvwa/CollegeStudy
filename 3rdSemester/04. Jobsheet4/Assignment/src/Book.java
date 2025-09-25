public class Book {
    private String title;
    private Author author;
    private boolean isBorrowed;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public boolean borrow() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        }
        return false;
    }

    public void returnBook() {
        isBorrowed = false;
    }

    public String info() {
        return "Title: " + title + ", Author: " + author.getName() + ", Borrowed: " + isBorrowed;
    }
}