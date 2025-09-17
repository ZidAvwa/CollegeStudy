public class Mahasiswa {
    private String NIM;
    private String nama;
    private Jurusan jur;

    public Mahasiswa(String nim, String nama, Jurusan jur) {
        this.NIM = nim;
        this.nama = nama;
        this.jur = jur;
    }

    public void setNIM(String nim) {
        this.NIM = nim;
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setJur(Jurusan jur) {
        this.jur = jur;
    }

    public Jurusan getJur() {
        return this.jur;
    }

    public void tampilkanInfo() {
        System.out.println("Student ID: " + NIM);
        System.out.println("Student Name: " + nama);
        jur.tampilkanInfo();
    }
}
