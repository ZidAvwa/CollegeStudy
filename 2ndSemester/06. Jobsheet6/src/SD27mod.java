import java.util.Scanner;

public class SD27mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        TopStudent27 topStudent = new TopStudent27(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Enter NIM: ");
            String nim = sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Class: ");
            String studentClass = sc.nextLine();
            System.out.print("Enter GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            topStudent.add(new Student27(nim, name, studentClass, gpa));
        }

        topStudent.print();
        topStudent.bubbleSort();
        System.out.println("Sorted list:");
        topStudent.print();
        sc.close();
    }
}
