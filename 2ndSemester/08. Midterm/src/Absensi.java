public class Absensi {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    int hadir;
    int sakit;
    int izin;
    int alpa;

    public Absensi(Mahasiswa mahasiswa, MataKuliah mataKuliah, int hadir, int sakit, int izin, int alpa) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.hadir = hadir;
        this.sakit = sakit;
        this.izin = izin;
        this.alpa = alpa;
    }

    public int totalPertemuan(){
        return hadir + sakit + izin + alpa;
    }
    public double hitungPersentaseKehadiran() {
        int totPertemuan = totalPertemuan();
        if (totPertemuan == 0) {
            return 0.0;
        }
        return (double) hadir / totPertemuan * 100;
    }

    public void tampilData() {
        System.out.println("NIM: " + mahasiswa.nim + " | Nama: " + mahasiswa.namaMahasiswa);
        System.out.println("Mata Kuliah: " + mataKuliah.namaMK);
        System.out.printf("Hadir: %d | Sakit: %d | Izin: %d | Alpa: %d%n",
                hadir, sakit, izin, alpa);
        System.out.printf("Persentase Kehadiran: %.2f%%%n", hitungPersentaseKehadiran());
        System.out.println();
    }

    public void cariData(){
        System.out.println("NIM: " + mahasiswa.nim + " | Nama: " + mahasiswa.namaMahasiswa);
        System.out.println("Mata Kuliah: " + mataKuliah.namaMK);
        System.out.printf("Hadir: %d | Sakit: %d | Izin: %d | Alpa: %d%n",
                hadir, sakit, izin, alpa);
        System.out.printf("Persentase Kehadiran: %.2f%%%n", hitungPersentaseKehadiran());
        System.out.println();
    }
}
