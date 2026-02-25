public class case3 {
    public static void main(int rows, int columns) {
        for (int i = 1; i <= rows; i++) { //to loop until enough row
            if (i == 1 || i == rows) { //when its the first and last row
                for (int j = 1; j <= columns; j++) { //loop until last column
                    System.out.print("*"); //add star
                }
            } 
            else { 
                for (int j = 1; j <= columns; j++) {
                    if (j == 1 || j == columns) { //when its the first and last column
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
