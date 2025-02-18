import java.util.Scanner;

class Arrays {
    static String name[] = null;
    static int sks[] = null;
    static int sem[] = null;
    static String days[] = null;
}
public class College {
    static Scanner zs = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("How many courses you want to add: ");
        int n = zs.nextInt();

        Arrays.name = new String[n];
        Arrays.sks = new int[n];
        Arrays.sem = new int[n];
        Arrays.days = new String[n];

        int choice;
        while (true) {
            System.out.println("\n====== Menu ======");
            System.out.println("Please select one of the menus below: ");
            System.out.println("1. Add a course");
            System.out.println("2. Display courses");
            System.out.println("3. Display courses (days)");
            System.out.println("4. Display courses (semester)");
            System.out.println("5. Search a course by the name");
            System.out.println("6. Exit");
            System.out.print("Select menu: ");
            choice = zs.nextInt();
            zs.nextLine();

            switch (choice) {
                case 1:
                    addCourse(n);
                    break;
                case 2:
                    displayAllCourse(n);
                    break;
                case 3:
                    searchbyDay(n);
                    break;
                case 4:
                    searchbySemester(n);
                    break;
                case 5:
                    searchCourse(n);
                    break;
                case 6:
                    System.out.println("Exit");
                    return;
            }
        }
    }

    public static void addCourse(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("\nCourse name: ");
            Arrays.name[i] = zs.nextLine();
            System.out.print("How many credit hours: ");
            Arrays.sks[i] = zs.nextInt();
            System.out.print("Course semester: ");
            Arrays.sem[i] = zs.nextInt();
            zs.nextLine();
            System.out.print("Course day: ");
            Arrays.days[i] = zs.nextLine();
        }
    }

    public static void displayAllCourse(int n) {
        System.out.printf("%n%-20s %-20s %-10s %-10s %n", "Subject", "Credit Hours", "Semester", "Day");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-20d %-10d %-10s %n", Arrays.name[i], Arrays.sks[i], Arrays.sem[i], Arrays.days[i]);

        }
    }
    public static void searchCourse(int n) {
        boolean find = false;

        System.out.print("Input the course name you want to search: ");
        String findbyName = zs.nextLine();

        System.out.printf("%n%-20s %-20s %-10s %-10s %n", "Subject", "Credit Hours", "Semester", "Day");

        for (int i = 0; i < n; i++) {
            if (findbyName.equalsIgnoreCase(Arrays.name[i])) {
                find = true;
                System.out.printf("%-20s %-20d %-10d %-10s %n", Arrays.name[i], Arrays.sks[i], Arrays.sem[i], Arrays.days[i]);
            }
        }

        if (!find) {
            System.out.println("no course in "+ findbyName);
        }
    }

    public static void searchbyDay(int n) {
        boolean find = false;

        System.out.print("Search day: ");
        String findbyDay = zs.nextLine();

        System.out.printf("%n%-20s %-20s %-10s %n", "Subject", "Credit Hours", "Semester");

        for (int i = 0; i < n; i++) {
            if (findbyDay.equalsIgnoreCase(Arrays.days[i])) {
                find = true;
                System.out.printf("%-20s %-20d %-10d %n", Arrays.name[i], Arrays.sks[i], Arrays.sem[i]);
            }
        }

        if (!find) {
            System.out.println("no course in "+ findbyDay);
        }
    }
    
    public static void searchbySemester(int n) {
        boolean find = false;

        System.out.print("Search Semester: ");
        int findbySemester = zs.nextInt();

        System.out.printf("%n%-20s %-20s %-10s %n", "Subject", "Credit Hours", "Day");

        for (int i = 0; i < n; i++) {
            if (findbySemester == Arrays.sem[i]) {
                find = true;
                System.out.printf("%-20s %-20d %-10s %n", Arrays.name[i], Arrays.sks[i], Arrays.days[i]);
            }
        }

        if (!find) {
            System.out.println("no course in "+ findbySemester);
        }
    }  
}