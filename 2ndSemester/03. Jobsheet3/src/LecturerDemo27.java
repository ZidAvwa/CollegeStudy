import java.util.Scanner;

public class LecturerDemo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lecturer27[] lecturerArray = new Lecturer27[3];

        for (int i = 0; i < 3; i++) {
            String id, name, gdr;
            int age;
            boolean gender = true;

            System.out.printf("Enter Lecturer Data - %d %n", i + 1);
            System.out.print("id\t: "); id = sc.nextLine();
            System.out.print("Name\t: "); name = sc.nextLine();
            System.out.print("Gender\t: "); gdr = sc.nextLine();
            System.out.print("Usia\t: "); age = sc.nextInt();
            sc.nextLine();

            System.out.println("------------------------------");

            if (gdr.equalsIgnoreCase("female")) {
                gender = false;
            }

            lecturerArray[i] = new Lecturer27(id, name, gender, age);
        }

        for (Lecturer27 lecturer : lecturerArray) {
            System.out.println("Data Dosen yang telah dimasukkan:");
            System.out.printf("id\t: %s %n", lecturer.id);
            System.out.printf("Name\t: %s %n", lecturer.name);
            System.out.printf("Gender\t: %s %n", (lecturer.gender ? "Male" : "Female"));
            System.out.printf("Age\t: %d %n", lecturer.age);
            System.out.println("------------------------");
        }

        LecturerData27 lecturerData = new LecturerData27();
        lecturerData.showAllLecturerData(lecturerArray);
        lecturerData.countLecturerByGender(lecturerArray);
        System.out.println("------------------------");
        lecturerData.averageLecturerAgeByGender(lecturerArray);
        System.out.println("------------------------");
        lecturerData.showOldestLecturerInfo(lecturerArray);
        System.out.println("------------------------");
        lecturerData.showYoungestLecturerInfo(lecturerArray);
        System.out.println("------------------------");
    }
}
