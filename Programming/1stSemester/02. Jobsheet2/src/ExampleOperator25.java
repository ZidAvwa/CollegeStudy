public class ExampleOperator25 {
    public static void main(String[] args){
        int x = 10;
        System.out.println("Initial value of x = " + x);
        System.out.println("x++ = " + x++);
        System.out.println("After evaluation, x = " + x);
        x = 10;
        System.out.println("Initial value of x = " + x);
        System.out.println("++x = " + ++x);
        System.out.println("After evaluation, x = " + x);
        int y = 12;
        System.out.println(x > y || y == x && y <= x);
        System.out.println("current x is = "+ x);
        System.out.println("current x is = "+ y);
        int z = x ^ y;
        System.out.println("The result of x ^ y is = " + z);
        z %= 2;
        System.out.println("The final result is " + z);
    }
}
