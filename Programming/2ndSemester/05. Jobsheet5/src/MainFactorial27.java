import java.util.Scanner;
public class MainFactorial27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();

        Factorial27 fk = new Factorial27();
        System.out.println("The factorial of " + num + " uning BF: " + fk.factorialBF(num));
        System.out.println("The factorial of " + num + " uning DC: " + fk.factorialDC(num));
    }
}
