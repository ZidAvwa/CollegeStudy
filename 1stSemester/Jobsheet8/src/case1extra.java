public class case1extra {
    public static void main(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
