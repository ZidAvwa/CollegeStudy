package Assignment;
import java.util.Scanner;
public class QueueMain {
    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nStudent Service Queue Menu:");
            System.out.println("1. Register Student");
            System.out.println("2. Call Next Student");
            System.out.println("3. View Front Student");
            System.out.println("4. View Rear Student");
            System.out.println("5. View All Students");
            System.out.println("6. View Total Students in Queue");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Purpose: ");
                    String purpose = sc.nextLine();
                    Student s = new Student(nim, name, purpose);
                    queue.enqueue(s);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peekFront();
                    break;
                case 4:
                    queue.peekRear();
                    break;
                case 5:
                    queue.printQueue();
                    break;
                case 6:
                    System.out.println("Total Students in Queue: " + queue.size());
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 0);
    }
}
