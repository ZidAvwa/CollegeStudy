import java.util.Scanner;
public class BankSystem27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance, withdrawAmount, depositAmount;
        int bank;
        int errorCount = 0;
        boolean isRunning = true;

        System.out.print("Enter your initial balance: ");
        balance = input.nextDouble();
        System.out.printf("Welcome! your current balance is $%.2f %n", balance);

        while (isRunning) {
            System.out.println("Choose an option: ");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            bank = input.nextInt();

            switch (bank) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    depositAmount = input.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Deposit successful! Your new balance is $%.2f", balance);
                        System.out.println();
                    } 
                    else {
                        System.out.println("Please input a valid balance");
                        errorCount++;
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    withdrawAmount = input.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Error: Insufficient balance. Transaction denied.");
                        errorCount++;
                    } 
                    else if (withdrawAmount < 500 && withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.printf("Withdrawal successful! Your new balance is $%.2f", balance);
                    } 
                    else if (withdrawAmount > 500) {
                        System.out.println("Error: You cannot withdraw more than $500 at once");
                        errorCount++;
                    } 
                    else {
                        System.out.println("Error: Invalid input");
                        errorCount++;
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.printf("Your current balance is $%.2f", balance);
                    System.out.println();
                    break;
                case 4:
                    System.out.printf("See you next time! Your final balance is $%.2f!", balance);
                    isRunning = false;
                    break;
                default:
                    System.out.println("Error: Please input a valid input");
                    errorCount++;
                    System.out.println();
                    break;
            }
            if (errorCount >= 3) {
                System.out.println(
                        "Too many invalid attempts. Your account has been temporarily locked for security reasons.");
                isRunning = false;
            }
        }
        input.close();
    }
}