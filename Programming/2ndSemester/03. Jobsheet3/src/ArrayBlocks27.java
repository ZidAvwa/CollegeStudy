public class ArrayBlocks27 {
    public static void main(String[] args) {
        Blocks27[] blArray = new Blocks27[3];
        blArray[0] = new Blocks27(100, 30, 12);
        blArray[1] = new Blocks27(120, 40, 15);
        blArray[2] = new Blocks27(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume blocks - " + i + " : " + blArray[i].countVolume());
        }
    }
}
