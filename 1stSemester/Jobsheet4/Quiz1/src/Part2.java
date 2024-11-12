import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        Float fahrenheit, kelvin;

        System.out.println("> Java PartTwo");
        System.out.print("Please input the temperature in F : ");

        fahrenheit = f.nextFloat();
        kelvin = (fahrenheit - 32) * 5/9 + 273.15f;

        System.out.println("-----------------------");
        System.out.println(String.format("The temperature in Kelvin is %.2f K", kelvin));

    }
}
