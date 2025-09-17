public class Jurusan {
    private String nama;
    private String akreditasi;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public String getAkreditasi() {
        return this.akreditasi;
    }

    public void tampilkanInfo() {
        System.out.println("Major: " + nama);
        System.out.println("Accreditation: " + akreditasi);
    }
}