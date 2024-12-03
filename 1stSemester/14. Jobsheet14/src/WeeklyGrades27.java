import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WeeklyGrades27 {
    private static final Map<String, Integer> nameToIntMap = new HashMap<>(); // Mapping for Int value to name
    private static final Map<Integer, String> intToNameMap = new HashMap<>(); // Mapping for name to Int value

    // Initialize the mappings
    static {
        nameToIntMap.put("Sari", 0);
        nameToIntMap.put("Rina", 1);
        nameToIntMap.put("Yani", 2);
        nameToIntMap.put("Dwi", 3);
        nameToIntMap.put("Lusi", 4);

        for (Map.Entry<String, Integer> entry : nameToIntMap.entrySet()) { // Loop to swap the name and int value
            intToNameMap.put(entry.getValue(), entry.getKey());
        }
    }

    public static int getIntValue(String name) { // Method to get integer value from name
        return nameToIntMap.getOrDefault(name, -1);
    }

    public static String getName(int value) { // Method to get name from integer value
        return intToNameMap.getOrDefault(value, "Unknown");
    }

    public static int[][] inputGrade(int array[][]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input students grade");
        System.out.print("Enter students name: ");
        String name = sc.nextLine();
        System.out.print("Enter week number: ");
        int column = sc.nextInt();
        System.out.print("Enter a grade: ");
        int grade = sc.nextInt();

        int row = getIntValue(name);
        sc.nextLine();

        if (array[row][column - 1] == 0) {
            array[row][column - 1] = grade;
        } else {
            System.out.println("Grade for " + name + " week " + column + " cannot be changed");
        }
        System.out.println();
        sc.close();
        return array;
    }

    public static void displayGrades(int array[][]) {
        System.out.println("Students Grades");
        for (int i = 0; i < array.length; i++) {
            System.out.print(getName(i) + "\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Week " + (j + 1) + " = " + array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void highestGradeEach(int array[][]) {
        for (int row = 0; row < array.length; row++) {
            int max = array[row][0]; // Assume the first element in the row is the max
            int week = 0; // Assume the first element is in column 0

            for (int col = 1; col < array[row].length; col++) { // Loop through each column in the current row
                if (array[row][col] > max) {
                    max = array[row][col]; // Update max if a larger value is found
                    week = col; // Update the column index for the new max value
                }
            }
            System.out.println(getName(row) + "'s " + "Highest grade:\t" + max + " (Week " + (week + 1) + ")");
        }
        System.out.println();
    }

    public static void studentWHighestGrade(int[][] array) {
        double highestAverage = 0;
        int student = -1; // To store the row index with the highest average

        for (int row = 0; row < array.length; row++) { // Loop through each row to calculate the average
            double sum = 0;
            for (int col = 0; col < array[row].length; col++) { // Calculate the sum of the elements in the current row
                sum += array[row][col];
            }
            double average = sum / array[row].length; // Calculate the average of the current row

            if (average > highestAverage) { // Compare with other row to check if the current row's average is the
                                            // highest
                highestAverage = average;
                student = row;
            }
        }
        System.out.print(student + "has the highest grades: ");
        for (int col = 0; col < array[student].length; col++) {
            System.out.print(array[student][col] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        int grades[][] = new int[5][7];
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu 1: Input students grade");
            System.out.println("Menu 2: Show students grades");
            System.out.println("Menu 3: Highest grade of each students");
            System.out.println("Menu 4: Student with highest grade");
            System.out.print("Select menu: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    sc.nextLine();
                    grades = inputGrade(grades);
                    break;
                case 2:
                    displayGrades(grades);
                    break;
                case 3:
                    highestGradeEach(grades);
                    break;
                case 4:
                    studentWHighestGrade(grades);
                    break;
            }

        }
        sc.close();
    }
}