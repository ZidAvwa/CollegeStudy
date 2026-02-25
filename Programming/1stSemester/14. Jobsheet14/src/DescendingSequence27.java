import java.util.Scanner;
public class DescendingSequence27 {
    public static void descendingRecursive(int n) { // Recursive way
        if (n < 0) {
            return; // Stop when n is less than 0
        }
        System.out.print(n + " "); // Print the current value of n
        descendingRecursive(n - 1); // Calls the function with n-1
    }

    public static void descendingIterative(int n) { // Iterative way
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " "); // Print the current value of i
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input your number: ");
        n = sc.nextInt();
        
        System.out.print("Recursive way: ");
        descendingRecursive(n); // Call the recursive function
        System.out.println();

        System.out.print("Iterative way: ");
        descendingIterative(n); // Call the iterative function
        System.out.println();
        sc.close();
    }
}
