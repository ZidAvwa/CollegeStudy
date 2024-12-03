import java.util.Scanner;
public class SummationRecursive27 {
    public static int sumRecursive(int n) { // Recursive function to calculate the sum from 1 to n
        if (n == 1) {
            System.out.print("1 ");
            return 1; // if 1 then return 1
        } else {
            System.out.print(n + " + ");
            return n + sumRecursive(n - 1); // n + sum of numbers from 1 to n-1
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input your number: ");
        n = sc.nextInt();

        System.out.print("= " + sumRecursive(n)); // call the function and add =
        sc.close();
    }
}
