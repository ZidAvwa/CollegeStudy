import java.util.Scanner;
public class ForMultiples27 {
    public static void main(String[] args) {
        int multiple, sum=0, counter=0, average;

        Scanner input = new Scanner(System.in);
        System.out.print("Input the multiples: ");
        multiple = input.nextInt();
        for (int i = 1; i <= 50; i++){
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }
        average = sum / counter;
        System.out.printf("There are %d number that are  multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
        System.out.printf("The average of all multiples of %d in range 1 to 50 is %d. \n", multiple, average);
    }
}