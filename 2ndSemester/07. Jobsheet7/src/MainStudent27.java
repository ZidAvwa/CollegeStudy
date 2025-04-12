import java.util.Scanner;

public class MainStudent27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        //int amountStudent = 5; change this line into this 2 lines
        System.out.print("Enter number of students: ");
        int amountStudent = s.nextInt();

        // SearchStudent37 data = new SearchStudent37(); change this line to this
        SearchStudent37 data = new SearchStudent37(amountStudent);

        System.out.println("--------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("------------");
            System.out.print("NIM\t: ");
            int nim = s.nextInt();
            System.out.print("Name\t: ");
            String name = s1.nextLine();
            System.out.print("Age\t: ");
            int age = s.nextInt();
            System.out.print("GPA\t: ");
            double gpa = s.nextDouble();

            Students27 std = new Students27(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("--------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);
        data.showPosition(search, position);
        data.showData(search, position);
        System.out.println("--------------------");
        System.out.println("Using Binary Search");
        int position1 = data.FindBinarySearch(search, 0, amountStudent - 1);
        data.showPosition(search, position1);
        data.showData(search, position1);

    }
}
