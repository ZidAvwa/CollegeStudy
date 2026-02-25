import java.util.Scanner;
public class ArrayAverageScore27Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double passed = 0, failed = 0;
        double averagePassed, averageFailed;
        double passedCount = 0, failedCounter = 0;
        
        int scorele;
        System.out.print("Enter the number of student: ");
        scorele = sc.nextInt();
        int score[] = new int[scorele];

        for (int i = 0; i < score.length; i++) {
            System.err.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                passed += score[i];
                passedCount++;
            }
            else{
                failed += score[i];
                failedCounter++;
            }
        }
        averagePassed = passed/passedCount;
        averageFailed = failed/failedCounter;
        System.out.println("The average of student who passed is " + averagePassed);
        System.out.println("The average of student who failed is " + averageFailed);
    }
}