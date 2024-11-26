public class case4 {
    public static void main() {
        int letter = 65; //in ASCII A equals 65
        int rows = 5;

        for (int i = 1; i <= rows; i++) {//to loop until meet the user input rows
            for (int j = rows - i; j > 0; j--) {//to loop space by using rows-i
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { //loop until 
                System.out.print((char) letter + " "); //print the char by converting the int to char
                letter++; //to go to the next letter
            }
            System.out.println(); //to print enter
        }
    }
}
