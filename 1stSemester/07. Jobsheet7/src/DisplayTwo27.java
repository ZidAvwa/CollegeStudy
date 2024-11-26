import java.util.Scanner;
public class DisplayTwo27 {
    public static void main(String[] args) {
        int numInput;
        Scanner input = new Scanner(System.in);
        System.out.print("Input some number: ");
        numInput = input.nextInt();
        for (int i = 1; i <= numInput; i++){
            if (i % 2 == 0) {
                System.out.println("2 multiple: "+ i);
            }
        }
    }
}
