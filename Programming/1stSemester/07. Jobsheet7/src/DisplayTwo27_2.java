import java.util.Scanner;
public class DisplayTwo27_2 {
    public static void main(String[] args) {
        int numInput;
        Scanner input = new Scanner(System.in);
        System.out.print("Input some number: ");
        numInput = input.nextInt();
        for (int i = 2; i <= numInput; i+=2){
            System.out.println("2 multiple: "+ i);
        }
    }
}
