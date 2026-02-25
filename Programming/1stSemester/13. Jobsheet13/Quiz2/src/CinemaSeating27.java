import java.util.Scanner;
public class CinemaSeating27 {
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        int row, column, action;
        boolean isRun = true;
        int audience[][] = {
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
        }; // Declare the audience seats array with 5x5 size and "0" inside each

        while (isRun) {
            // Display current seat
            System.out.println("\nCurrent Available Seats:");
            for (int i = 0; i < audience.length; i++) { // first loop for row
                for (int j = 0; j < audience[i].length; j++) { // seccond loop for column
                    System.out.print(audience[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nMenu: ");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            action = zs.nextInt();
            zs.nextLine();

            switch (action) {
                case 1: // Action 1 book a seat
                    System.out.print("Enter row number (0-4): ");
                    row = zs.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    column = zs.nextInt();
                    zs.nextLine();

                    if (row >= 0 && row < 5 && column >= 0 && column < 5) { // if correct seat location
                        if (audience[row][column] == 0) { // if seat are not occupied
                            audience[row][column] = 1;
                            System.out.println("Seat successfully booked.");
                        } 
                        else { // if selected seat are occupied
                            System.out.println("Seat already booked. Please choose a different seat.");
                        }
                    } 
                    else {
                        System.out.println("Invalid seat location. Please try again.");
                    }
                    break;

                case 2: // Action 2 remove booked  seat
                    System.out.print("Enter row number (0-4): ");
                    row = zs.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    column = zs.nextInt();
                    zs.nextLine();

                    if (row >= 0 && row < 5 && column >= 0 && column < 5) {
                        if (audience[row][column] == 1) { // if selected seat are occupied
                            audience[row][column] = 0; 
                            System.out.println("Booking successfully cancelled.");
                        } 
                        else { // if seat are not occupied
                            System.out.println("Seat is not booked. Nothing to cancel.");
                        }
                    } 
                    else {
                        System.out.println("Invalid seat location. Please try again.");
                    }
                    break;

                case 3: // Action 3 Terminate program
                    System.out.println("Exiting the program. Thank you!");
                    isRun = false;

                default: // unidentified action
                    System.out.println("Invalid option. Please try again.");
            }
        }
        zs.close();
    }
}