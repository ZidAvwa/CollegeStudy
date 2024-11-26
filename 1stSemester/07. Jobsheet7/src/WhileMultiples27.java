import java.util.Scanner;
public class WhileMultiples27 {
    public static void main(String[] args) {
        int multiple, sum = 0, counter = 0, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the multiples: ");
        multiple = input.nextInt();
        while (i <= 50){
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
            i++;
        }
        System.out.printf("There are %d number that are  multiple of %d in range 1 to 50.\n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d. \n", multiple, sum);
    }
}
