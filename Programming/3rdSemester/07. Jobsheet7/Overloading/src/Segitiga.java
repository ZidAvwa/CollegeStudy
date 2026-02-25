class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
        return sisiA + sisiB + sisiC;
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println(s.totalSudut(60));
        System.out.println(s.totalSudut(60, 50));
        System.out.println(s.keliling(3, 4, 5));
        System.out.println(s.keliling(3, 4));
    }
}