import java.util.Scanner;

public class LibraryManage {
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        String[] bookName = { "Harry Potter", "Lord of The Ring", "The Alchemist", "Sherlock Holmes" };
        String[] bookISBN = { "978-3-16-148410-0", "978-1-843-56710-2", "978-0-06-231500-7", "978-1-566-19310-3" };
        String[] availability = { "Available", "Available", "Available", "Available" };
        int action = 0;
        mainMenu(zs, action, bookName, bookISBN, availability);
    }

    public static void mainMenu(Scanner zs, int action, String[] name, String[] isbn, String[] ava) {
        while (true) {
            System.out.println("\n- Welcome to our Library -");
            displayBook(name, isbn, ava);
            System.out.println("\n1. Borrow book");
            System.out.println("2. Return book");
            System.out.println("3. Exit");
            System.out.print("Choose your action: ");
            action = zs.nextInt();

            switch (action) {
                case 1:
                    borrowBook(zs, action, name, isbn, ava);
                    break;
                case 2:
                    returnBook(zs, action, name, isbn, ava);
                    break;
                case 3:
                    System.out.println("Thanks for using our service");
                    return;
                default:
                    System.out.println("Invalid action");
                    break;
            }
        }
    }

    public static void displayBook(String[] name, String[] isbn, String[] ava) {
        String[] menu = { "Index", "Title", "ISBN", "Availability" };
        System.out.println(String.format("%-10s%-20s%-21s%s", menu[0], menu[1], menu[2], menu[3]));
        for (int i = 0; i < name.length; i++) {
            System.out.println(String.format("%-10d%-20s%-21s%s", (i + 1), name[i], isbn[i], ava[i]));
        }
    }

    public static void borrowBook(Scanner zs, int action, String[] name, String[] isbn, String[] ava) {
        while (true) {
            System.out.print("Select book to borrow (Enter 0 to cancel): ");
            action = zs.nextInt();
            action -= 1;

            if (action == -1) {
                System.out.println("You cancelled the action");
                return;
            } else if (ava[action] == "Available") {
                ava[action] = "Borrowed";
                System.out.println("Thanks for borrowing " + name[action]);
                return;
            } else {
                System.out.println("Book " + name[action] + " is currently borrowed");
                System.out.println("Please select different book");
            }
        }
    }

    public static void returnBook(Scanner zs, int action, String[] name, String[] isbn, String[] ava) {
        while (true) {
            System.out.print("Select book to return (Enter 0 to cancel): ");
            action = zs.nextInt();
            action -= 1;

            if (action == -1) {
                System.out.println("You cancelled the action");
                return;
            } else if (ava[action] == "Borrowed") {
                ava[action] = "Available";
                return;
            } else {
                System.out.println("Book " + name[action] + " is available");
                System.out.println("Please enter correct book");
            }
        }
    }
}