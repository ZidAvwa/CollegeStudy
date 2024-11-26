public class case1 {
    public static void main(int num) {
        for (int i = 1; i <= num; i++) { //to loop until meet the user input row
            for (int j = 1; j <= i; j++) { //to loop until there is enough star
                System.out.print("* "); //to add star
            }
            System.out.println();//to add the enter
        }
    }
}
