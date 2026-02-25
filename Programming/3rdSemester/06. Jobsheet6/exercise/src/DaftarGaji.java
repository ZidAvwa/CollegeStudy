public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int index;

    public DaftarGaji(int jumlah) {
        listPegawai = new Pegawai[jumlah];
        index = 0;
    }

    public void addPegawai(Pegawai p) {
        if (index < listPegawai.length) {
            listPegawai[index] = p;
            index++;
        }
    }

    public void printSemuaGaji() {
        System.out.println("=== Daftar Gaji Pegawai ===");
        for (Pegawai p : listPegawai) {
            if (p != null) {
                System.out.println("Nama: " + p.getNama() + ", Gaji: " + p.getGaji());
            }
        }
    }
}