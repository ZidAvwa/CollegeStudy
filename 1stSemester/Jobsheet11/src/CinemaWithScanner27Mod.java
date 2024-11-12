import java.util.Scanner;

public class CinemaWithScanner27Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int row, column, menu;
        String audience[][] = new String[4][2];
        boolean isRunning1 = true;

        while (isRunning1) {
            System.out.println("Menu 1: Input audience data");
            System.out.println("Menu 2: Show audience list");
            System.out.println("Menu 3: Exit");
            System.out.print("Select menu: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    boolean isRunning2 = true;
                    sc.nextLine();
                    while (isRunning2) {
                        System.out.println("Input audience data");
                        System.out.print("Enter a name: ");
                        name = sc.nextLine();
                        System.out.print("Enter row number: ");
                        row = sc.nextInt();
                        System.out.print("Enter column number: ");
                        column = sc.nextInt();

                        sc.nextLine();
                        if (audience[row - 1][column - 1] == null) {
                            audience[row - 1][column - 1] = name;
                            isRunning2 = false;
                        } else {
                            System.out.println("Seat row " + row + " column " + column + " already occupied");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Audience list");
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                audience[i][j] = "***";
                            }
                        }
                        System.out.println("Audiences in the row " + (i + 1) + ": " + String.join(", ", audience[i]));
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == "***") {
                                audience[i][j] = null;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Thanks for using our service");
                    isRunning1 = false;
                    break;
            }

        }
    }
}