import java.util.Scanner;
public class LecturerDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData27 data = new LecturerData27();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest to Oldest)");
            System.out.println("4. Sort DSC (Oldest to Youngest)");
            System.out.println("5. Search by Name (Sequential Search)"); // Add these 2 option
            System.out.println("6. Search by Age (Binary Search)"); // .
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Gender (true for Male, false for Female): ");
                    boolean gender = sc.nextBoolean();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    data.add(new Lecturer27(id, name, gender, age));
                    break;
                case 2:
                    data.print();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Sorted (Ascending) by Age:");
                    data.print();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Sorted (Descending) by Age:");
                    data.print();
                    break;
                case 5:
                    System.out.print("Enter Name to search: ");
                    String searchName = sc.nextLine();
                    data.sequentialSearch(searchName);
                    break;
                case 6:
                    System.out.print("Enter Age to search: ");
                    int searchAge = sc.nextInt();
                    data.binarySearch(searchAge);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
            }
        } while (choice != 5);
    }
}
