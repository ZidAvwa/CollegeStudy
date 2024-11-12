public class case2extra {
    public static int Case2(int num1, int num2) {
        int result = 1;
        if (num2 > num1 - num2) {
            num2 = num1 - num2;
        }
        for (int i = 0; i < num2; i++) {
            result *= (num1 - i);
            result /= (i + 1);
        }
        return result;
    }

    public static void main(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(Case2(i, j) + " ");
            }
            System.out.println();
        }
    }
}
