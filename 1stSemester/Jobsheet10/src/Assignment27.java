import java.util.Scanner;
public class Assignment27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEl;
        double total = 0, average;
   
        System.out.print("Enter the number of array elements: ");
        numEl = sc.nextInt();
        int arrayInt[] = new int[numEl];

        for (int i = 0; i < arrayInt.length; i++) {
            System.err.print("Enter the array element " + (i+1) + ": ");
            arrayInt[i] = sc.nextInt();
        }
        for (int i = 0; i < arrayInt.length; i++) { 
            total += arrayInt[i];
        }
        average = total/arrayInt.length;
        
        int biggest = arrayInt[0];
        int smallest = arrayInt[0];

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > biggest){
                biggest = arrayInt[i];
            }
            if (arrayInt[i] < smallest) {
                smallest = arrayInt[i];
            }
        }
        System.out.println("the average is: "+ average);
        System.out.println("the biggest number is: "+biggest);
        System.out.println("the smallest number is: "+smallest);
    }
    
}
