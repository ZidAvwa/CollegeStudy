public class case2 {
    public static int Case2(int num1, int num2) { //to count add number on the next row
        int result = 1;
        if (num2 > num1 - num2) { //when j is bigger than i - j (num2=j, num1=i)
            num2 = num1 - num2;
        }
        for (int i = 0; i < num2; i++) {
            result *= (num1 - i);
            result /= (i + 1);
        }
        return result;
    }

    public static void main(int num) {
        for (int i = 0; i < num; i++) { //to loop until meet the user input row
            for (int j = 0; j <= i; j++) { //to loop until there is a triangle
                System.out.print(Case2(i, j) + " "); //to call the result from Case2
            }
            System.out.println();
        }
    }
}
