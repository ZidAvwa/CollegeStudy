import java.util.Scanner;
public class EvenOdd25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input Integer Number: ");
        int number = sc.nextInt();
        if (number % 2 == 0){
            System.out.println("The "+number+" is even number");
        }
        else{
            System.out.println("The "+number+" is odd number");
        }
    }
}
