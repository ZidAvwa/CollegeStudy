import java.util.Scanner;
public class ArrayAverageScore27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score[] = new int[10];
        double total = 0;
        double average;

        for (int i = 0; i < 10; i++) {
            System.err.print("Enter student score " + (i+1) + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        average = total/score.length;

        System.out.println("The class average score is " + average);
        
    }
}