import java.util.Scanner;
public class ArrayOfObjects27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rectangles: ");
        int n = sc.nextInt();
        Rectangle27[] rectangleArray = new Rectangle27[n];

        for (int i = 0; i < 3; i++){
            rectangleArray[i] = new Rectangle27();
            System.out.println("Rectangle " + i);

            System.out.print("Input length : ");
            rectangleArray[i].length = sc.nextInt();

            System.out.print("Input width : ");
            rectangleArray[i].width = sc.nextInt();
        }

        Rectangle27[][] rectangleGrid = new Rectangle27[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                rectangleGrid[i][j] = new Rectangle27();
                rectangleGrid[i][j].length = (i + 1) * 10;
                rectangleGrid[i][j].width = (j + 1) * 5;
            }
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Rectangle " + i);
            System.out.println("First rectangle, width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
        }
    }
}