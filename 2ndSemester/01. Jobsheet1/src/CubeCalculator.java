import java.util.Scanner;

public class CubeCalculator {

    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        int menu, length;

        System.out.print("Input your cube edge length: ");
        length = zs.nextInt();

        System.out.println("Calculator Menu");
        System.out.println("1. Volume");
        System.out.println("2. Surface Area");
        System.out.println("3. Perimeter");
        System.out.println("4. Exit");
        System.out.print("Input menu: ");
        menu = zs.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Your cube volume is: ");
                System.out.print(volume(length));
                break;
            case 2:
                System.out.print("Your cube surface area is:");
                System.out.print(surfaceArea(length));
                break;
            case 3:
                System.out.print("Your cube perimeter is:");
                System.out.print(perimeter(length));
                break;
            case 4:
                System.out.println("Exited from calculator");
                break;
            default:
                System.out.println("Invalid menu");
                break;
        }
    }

    public static int volume(int l) {
        return (l * l * l);
    }

    public static int surfaceArea(int l) {
        return (6 * l * l);
    }

    public static int perimeter(int l) {
        return (12 * l);
    }
}