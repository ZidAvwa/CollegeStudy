import java.util.Scanner;
public class JavaCase27 {
    public static void main(String[] args) {
        while (true) { //i use while program doesn't stop until user input wrong case
            Scanner input = new Scanner(System.in);
            String bahan = "";
            int number;
            bahan = input.nextLine();

            switch (bahan) { //i use switch tomake the program more compact
                case "java Case1":
                    System.out.print("Input a number: ");
                    number = input.nextInt();
                    case1.main(number); //i call the program from other class
                    break;
                case "java Case2":
                    System.out.print("Input a number: ");
                    number = input.nextInt();
                    case2.main(number);
                    break;
                case "java Case3":
                    int rows, columns;
                    System.out.print("Input number of rows: ");
                    rows = input.nextInt();
                    System.out.print("Input number of columns: ");
                    columns = input.nextInt();
                    case3.main(rows, columns);
                    break;
                case "java Case4":
                    case4.main(); //4th case doesn't need input
                    break;
                case "extra1":
                    System.out.print("Input a number: ");
                    number = input.nextInt();
                    case2extra.main(number);
                    break;
                case "extra2":
                    System.out.print("Input a number: ");
                    number = input.nextInt();
                    case1extra.main(number);
                    break;
                default:
                    return;
            }
        }
    }
}