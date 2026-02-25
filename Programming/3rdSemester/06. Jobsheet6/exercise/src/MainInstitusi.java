public class MainInstitusi {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("123", "Dr. Zid", "Surabaya");
        dosen1.setSKS(12);

        Dosen dosen2 = new Dosen("456", "Prof. Avwa", "Malang");
        dosen2.setSKS(10);

        DaftarGaji daftar = new DaftarGaji(2);
        daftar.addPegawai(dosen1);
        daftar.addPegawai(dosen2);

        daftar.printSemuaGaji();
    }
}