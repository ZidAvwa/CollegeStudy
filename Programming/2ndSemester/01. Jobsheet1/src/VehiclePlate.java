import java.util.Scanner;
public class VehiclePlate {
    public static void main(String[] args) {
        int index = -1;
        char inputCODE;
        char CODE[] = {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'L', 'N', 'T'}; 
        char CITY[][] = {{'B', 'A', 'N', 'T', 'E', 'N'},
        {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
        {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
        {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
        {'B', 'O', 'G', 'O', 'R'},
        {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
        {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
        {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
        {'M', 'A', 'L', 'A', 'N', 'G'},
        {'T', 'E', 'G', 'A', 'L'}
        };
        Scanner zs = new Scanner(System.in);
        
        System.out.print("Input Plate Code: ");
        inputCODE = zs.next().charAt(0);

        for (int i = 0; i < CODE.length; i++) {
            if (inputCODE == CODE[i]) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.print("City name: ");
            for (int i = 0; i < CITY[index].length; i++) {
                    System.out.print(CITY[index][i]);
            }

        } else {
            System.out.println("City of the Code not found");
        }
    }
}