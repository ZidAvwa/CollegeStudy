import java.util.Scanner;
public class Inventory27 {
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        String itemsNm[] = { "Apples", "Banana", "Chery", "Dates", "Eggplant" }; // Declare the items
        int itemsQt[] = { 50, 30, 40, 60, 20 }; // Declare the items quantity
        boolean isRun = true;
        int index, action, AddRemoveQt;

        while (isRun) { // to keep the code running
            System.out.println("\nCurrent Inventory: "); // Display the Inventory
            for (int i = 0; i < itemsQt.length; i++) {
                System.out.println(i + ". " + itemsNm[i] + ": " + itemsQt[i]);
            }

            System.out.println();
            System.out.print("Enter the index of item to manage (0-4, or 99 to exit): ");
            index = zs.nextInt();
            
            if (index >= 0 && index < 5) {
                System.out.println("Selected item: " + itemsNm[index]);
                System.out.print("Enter action (1: Add stock, 2: Remove stock): ");
                action = zs.nextInt();
                switch (action) { //  Switch case to chose action
                    case 1: // Add stock
                        System.out.print("Enter quantity: ");
                        AddRemoveQt = zs.nextInt();
                        itemsQt[index] += AddRemoveQt;
                        System.out.println("Stock added succesfully.");
                        break;

                    case 2: // Remove stock
                        System.out.print("Enter quantity: ");
                        AddRemoveQt = zs.nextInt();

                        if (AddRemoveQt > itemsQt[0]) { // When user remove bigger than current qt
                            System.out.println("Not enough stock to remove.");
                            break;
                        } 
                        else { // when user input correctqt to remove
                            itemsQt[index] -= AddRemoveQt;
                            System.out.println("Stock removed succesfully.");
                        }
                        break;

                    default:
                        System.out.println("Enter correct action (1 or 2)");
                        continue;
                }
            }
            else if (index == 99){ // Terminate the program, when user input 99
                System.out.println("Program terminated!");
                isRun = false;
            }
            else{ // restart program, when user give wrong input
                System.out.println("Invalid index. Try again.");
            }
        }
        zs.close();
    }
}
