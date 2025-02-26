public class ArrayTriangle {
    public static void main(String[] args) {
        Triangle27[] trArray = new Triangle27[4];
        trArray[0] = new Triangle27(10, 4);
        trArray[1] = new Triangle27(20, 10);
        trArray[2] = new Triangle27(15, 6);
        trArray[3] = new Triangle27(25, 10);

        for (int i = 0; i < 4; i++) {
            System.out.println("Triangle " + i + ": Area = " + trArray[i].countArea() + ", Perimeter = " + trArray[i].countPerimeter());
        }
    }
    
}
