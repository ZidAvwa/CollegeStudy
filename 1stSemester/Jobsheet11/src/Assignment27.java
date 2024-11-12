import java.util.Scanner;

public class Assignment27 {
    static void sumDiagonals(int matrix[][], int matrixSize) {
        int primary = 0, secondary = 0;
        for (int k = 0; k < matrixSize; k++) {
            for (int l = 0; l < matrixSize; l++) {
                if (k == l)
                    primary += matrix[k][l];
                if ((k + l) == (matrixSize - 1))
                    secondary += matrix[k][l];
            }
        }
        System.out.println("Sum of Primary Diagonal: " + primary);
        System.out.println("Sum of Secondary Diagonal: " + secondary);
    }
    static void checkSymmetric(int matrix[][], int matrixSize) {
        int i, j;
        int transpose[][] = new int[matrixSize][matrixSize];
        for (i = 0; i < matrixSize; i++) {
            for (j = 0; j < matrixSize; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        for (i = 0; i < matrixSize; i++) {
            for (j = 0; j < matrixSize; j++) {
                if (matrix[i][j] == transpose[i][j]) {
                    System.out.print("The matrix is symmetric");
                    break;
                } else {
                    System.out.print("The matrix is not symmetric");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int row, column, menu, matrixSize;
        int matrix[][];
        String ask;
        boolean isRunning1 = true;

        System.out.print("Input the size of your matrix: ");
        matrixSize = sc.nextInt();
        matrix = new int[matrixSize][matrixSize];

        while (isRunning1) {

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Menu 1: Input number on matrix");
            System.out.println("Menu 2: Primary and secondary diagonal");
            System.out.println("Menu 3: Check is the matrix symmetrical");
            System.out.print("Enter the menu: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Input your matrix");
                    System.out.print("Enter a number: ");
                    number = sc.nextInt();
                    System.out.print("Enter row number: ");
                    row = sc.nextInt();
                    System.out.print("Enter column number: ");
                    column = sc.nextInt();

                    sc.nextLine();
                    if (row > matrixSize || column > matrixSize || row < 0 || column < 0) {
                        System.out.println("Incorrect location. Try Again");
                    } else {
                        if (matrix[row][column] == 0) {
                            matrix[row][column] = number;
                        } else {
                            System.out.println("Row " + row + " Column " + column + " already occupied");
                            System.out.print("Do you want to replace the number? (y/n): ");
                            ask = sc.nextLine();
                            if (ask == "y") {
                                matrix[row][column] = number;
                            } else if (ask == "n") {
                                continue;
                            } else {
                                System.out.println("Incorrect answer, your number doesn't replace");
                                continue;
                            }
                        }
                    }
                    break;
                case 2:
                    sumDiagonals(matrix, matrixSize);
                    break;
                case 3:
                    checkSymmetric(matrix, matrixSize);
                    break;
                case 4:
                    isRunning1 = false;
            }

        }
    }
}
