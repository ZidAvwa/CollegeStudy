import java.util.Scanner;
public class Assigment4 {
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        int angle1, angle2, angle3;

        System.out.print("Input your first angle : ");
        angle1 = zs.nextInt();
        System.out.print("Input your second angle : ");
        angle2 = zs.nextInt();
        System.out.print("Input your third angle : ");
        angle3 = zs.nextInt();

        int total = angle1 + angle2 + angle3;
        if (total == 180){
            if (angle1 == angle2 && angle1 == angle3){
                System.out.println("Your triangle is equiangular");
            }
            else if (angle1 == 90 || angle2 == 90 || angle3 == 90){
                System.out.println("Your triangle is Right angled");
            }
            else if (angle1>90 || angle2>90 || angle3>90){
                System.out.println("Your triangle is Obtuse angled");
            }
            else{
                System.out.println("Your triangle is Acute angled");
            }
        }
        else {
            System.out.println("invalid triangle angles");
        }
    }
}
