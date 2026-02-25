import java.util.Scanner;
public class SumMain27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input element number: ");
        int element = input.nextInt();

        Sum27 sm = new Sum27(element);
        for (int i = 0; i < element; i++) {
            System.out.print("Input Profit " + (i + 1) + ": ");
            sm.profits[i] = input.nextDouble();
        }

        System.out.println("Profit total using BF: " + sm.totalBF());
        System.out.println("Profit total using BF: " + sm.totalDC(sm.profits, 0, element - 1));
    }
}
