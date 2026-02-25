import java.util.Scanner;
public class PowerRecursive27Mod {
    static int calculatePower(int base, int pow){
        if (pow == 0) {
            return 1;
        }
        else{
            return base*calculatePower(base, pow-1);
        }
    }
    public static void main(String[] args) {
        String rec= ""; //the output will be a string
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int power = input.nextInt();
        for (int i = 0; i < power; i++) {  // i make a separate code from the function
            rec += base+"x";
        }
        System.out.println("Result of " + base + " power " + power + " = " + rec + "1= " + calculatePower(base, power));
    }
}
