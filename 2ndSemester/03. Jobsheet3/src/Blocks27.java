public class Blocks27 {
    public int width, length, height;

    public Blocks27(int p, int l, int t){
        length = p;
        width = l;
        height = t;
    }
    public int countVolume(){
        return length*width*height;
    }
}
