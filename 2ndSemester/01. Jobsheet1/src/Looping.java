import java.util.Scanner;
public class Looping {
    public static void main(String[] args) {
        Scanner zs = new Scanner(System.in);
        String nim;

        System.out.print("Masukkan NIM: "); nim = zs.nextLine();
        String extractLastTwo = nim.substring(nim.length() - 2); //mencari 2 digit terakhir
        int lastTwo = Integer.parseInt(extractLastTwo);

        for (int i=1; i<=nim.length(); i++){
            if (i%2==1) System.out.print("*");
            else if (i==6 || i==10) System.out.print("");
            else System.out.print(i);
            System.out.print(" ");
        }
        if (lastTwo < 10) lastTwo += 10;
        System.out.print(lastTwo);
    }
}