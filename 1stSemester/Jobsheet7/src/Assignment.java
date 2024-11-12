import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numInput;
        String s = "* ";
        System.out.print("Input some number: ");
        numInput = input.nextInt();

        for (int i = numInput; i>0; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
