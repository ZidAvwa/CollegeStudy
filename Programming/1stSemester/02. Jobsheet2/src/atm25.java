import java.util.Scanner;
public class atm25 {
    public static void main(String[] args){
        int pin = 123456;
        double balance = 100000;
        Scanner pinInput = new Scanner(System.in);
        System.out.println("Enter PIN");
        int userPIN = pinInput.nextInt();

        if (userPIN == pin){
            System.out.println("Your balance is Rp."+ balance);
            Scanner withdraw = new Scanner(System.in);
            System.out.println("Enter money amount to withdraw");
            double money = withdraw.nextDouble();
            if (money > balance){
                System.out.println("not enough balance");
            }
            else {
                return;
            }
        }
        else {
            System.out.println("wrong PIN");
            return;
        }
    }
}
