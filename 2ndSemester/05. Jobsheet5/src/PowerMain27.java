import java.util.Scanner;
public class PowerMain27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input elemnt number: ");
        int element = input.nextInt();

        Power27[] png = new Power27[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Input base number for " + (i + 1) + "th element: ");
            int basis = input.nextInt();
            System.out.print("Input exponent for " + (i + 1) + "th element: ");
            int exp = input.nextInt();
            png[i] =  new Power27(basis, exp);
        }

        System.out.println("POWER RESULT USING BRUTEFORCE");
        for (Power27 p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerBF(p.baseNumber, p.exponent));
        }
        System.out.println("POWER RESULT USING DIVIDE AND CONQUER");
        for (Power27 p : png) {
            System.out.println(p.baseNumber + "^" + p.exponent + ": " + p.powerDC(p.baseNumber, p.exponent));
        }
    }
}
