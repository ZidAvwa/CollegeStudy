public class Main {
    public static void main(String[] args) {
        Manusia a = new Dosen();
        Manusia b = new Mahasiswa();

        a.bernafas();
        a.makan();   // calls Dosen.makan()

        b.bernafas();
        b.makan();   // calls Mahasiswa.makan()
    }
}