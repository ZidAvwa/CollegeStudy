import java.util.Scanner;
public class StudentDemo27 {
    public static void main(String[] args) {
        StudentAssignmentStack27 stack = new StudentAssignmentStack27(5);
        Scanner zs = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Submit Assignment");
            System.out.println("2. Grade Assignment");
            System.out.println("3. View Top Assignment");
            System.out.println("4. View All Assignments\r");
            System.out.println("5. View First Assignment");
            System.out.print("Choose a menu: ");
            choice = zs.nextInt();
            zs.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = zs.nextLine();
                    System.out.print("NIM: ");
                    String nim = zs.nextLine();
                    System.out.print("Kelas: ");
                    String className = zs.nextLine();

                    Student27 student = new Student27(nim, name, className);
                    stack.push(student);
                    System.out.printf("%s's assignment has been successfully submitted!!\n", student.name);
                    break;

                case 2:
                    Student27 toBeGraded = stack.pop();
                    if (toBeGraded != null) {
                        System.out.printf("Grading assignment from %s - %s\n", toBeGraded.name, toBeGraded.nim);
                        System.out.print("Input grade (0-100): ");
                        int grade = zs.nextInt();
                        toBeGraded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", toBeGraded.name, grade);
                        
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;

                case 3:
                    Student27 topStudent = stack.peek();
                    if (topStudent != null) {
                        System.out.printf("The last assignment comes from %s\n", topStudent.name);
                    }
                    break;

                case 4:
                    System.out.println("Assignment list:");
                    System.out.println("NIM\tName\tClass\tGrade");
                    stack.print();
                    break;
                
                case 5:
                    Student27 first = stack.getFirstStudent();
                    if (first != null) {
                        System.out.printf("First Assignment submitted by %s\n", first.name);
                    }
                    break;
                

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice >= 1 && choice <= 4);
    }
}
