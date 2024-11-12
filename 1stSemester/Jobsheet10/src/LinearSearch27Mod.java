import java.util.Scanner;
public class LinearSearch27Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key, numEl;
        int result = 0;
   
        System.out.print("Enter the number of array elements: ");
        numEl = sc.nextInt();
        int arrayInt[] = new int[numEl];

        for (int i = 0; i < arrayInt.length; i++) {
            System.err.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Enter the key you want to search for: ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key){
                result = i;
                break;
            }
            else {
                result = -1;
            }
        }
        if (result > 0) {
            System.out.println("The key in the array is located at index position " + result);
        }
        else{
            System.out.println("Key not found");
        }
    }
}