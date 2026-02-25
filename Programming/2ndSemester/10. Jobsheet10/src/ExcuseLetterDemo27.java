import java.util.Scanner;

public class ExcuseLetterDemo27 {
    public static void main(String[] args) {
        ExcuseLetterStack27 stack = new ExcuseLetterStack27(5);
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Name");
            System.out.print("Choose a menu: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = input.nextLine();
                    System.out.print("Name: ");
                    String name = input.nextLine();
                    System.out.print("Class: ");
                    String className = input.nextLine();
                    System.out.print("Type of Excuse (S = Sick, O = Other): ");
                    char type = input.nextLine().toUpperCase().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = input.nextInt();
                    input.nextLine();

                    ExcuseLetter27 letter = new ExcuseLetter27(id, name, className, type, duration);
                    stack.push(letter);
                    System.out.println("Excuse letter submitted successfully.");
                    break;

                case 2:
                    ExcuseLetter27 processed = stack.pop();
                    if (processed != null) {
                        System.out.printf("Processing letter from %s (%s)\n", processed.name, processed.id);
                    }
                    break;

                case 3:
                    ExcuseLetter27 latest = stack.peek();
                    if (latest != null) {
                        System.out.printf("Latest letter from %s (%s)\n", latest.name, latest.id);
                    }
                    break;

                case 4:
                    System.out.print("Enter student name to search: ");
                    String searchName = input.nextLine();
                    ExcuseLetter27 found = stack.searchByName(searchName);
                    if (found != null) {
                        System.out.println("Letter Found:");
                        System.out.println("ID\tName\tClass\tType\tDuration");
                        System.out.println(found.id + "\t" + found.name + "\t" + found.className + "\t" + found.typeOfExcuse + "\t" + found.duration);
                    } else {
                        System.out.println("Letter not found.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice >= 1 && choice <= 4);
    }
}
